package com.axh.media.repository;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.axh.common.enums.LogicalOperation;
import com.axh.common.enums.SortOrder;
import com.axh.media.model.domain.Film;
import com.axh.media.model.mapping.FilmMapping;
import com.axh.media.repository.contracts.ITorrentsRepository;

@Repository
public class TorrentsRepository implements ITorrentsRepository {
	@Autowired
	private SessionFactory torrentsSessionFactory;

	/* (non-Javadoc)
	 * @see com.axh.media.repository.ITorrentsRepository#getFilmById(int)
	 */
	@Override
	public Film getFilmById(int id) {
		Session session = torrentsSessionFactory.openSession();
		Film film = (Film)session.get(Film.class, id);
		session.close();
		return film;
    }
	
	/* (non-Javadoc)
	 * @see com.axh.media.repository.ITorrentsRepository#getFilmByTitle(java.lang.String)
	 */
	@Override
	public Film getFilmByTitle(String title) {
		Session session = torrentsSessionFactory.openSession();
		
		Object result = session.createCriteria(Film.class).add(Restrictions.eq("title", title)).uniqueResult();
		session.close();
		
		if(result == null) {
			return null;
		}
		
		return (Film)result;
	}
	
	/* (non-Javadoc)
	 * @see com.axh.media.repository.ITorrentsRepository#getAllFilms()
	 */
	@Override
	public List<Film> getAllFilms() {
		Session session = torrentsSessionFactory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Film> films = session.createCriteria(Film.class).list();
		
		session.close();
		return films;
	}
	
	@Override
	public List<Film> getFilmsByPageNumber(int pageNumber, int pageSize) {
		Session session = torrentsSessionFactory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Film> films = session.createCriteria(Film.class)
			.setFirstResult((pageNumber - 1) * pageSize)
			.setMaxResults(pageSize)
			.list();
		
		session.close();
		return films;
	}

	@Override
	public List<Film> getFilmsByPageNumber(int pageNumber, int pageSize,
			List<FilmMapping> projections,
			List<ImmutableTriple<FilmMapping, LogicalOperation, Object>> conditions,
			List<ImmutablePair<FilmMapping, SortOrder>> orderBys) {
		
		Session session = torrentsSessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Film.class);
		
		if(projections != null && !projections.isEmpty()) {
			ProjectionList projectionList = Projections.projectionList();
			projections.stream().map(x -> Projections.property(x.getFieldName())).forEach(x -> projectionList.add(x));
		}
		
		if(conditions != null && !conditions.isEmpty()) {
			conditions.stream().map(x -> {
					String fieldName = x.left.getFieldName();
					switch(x.middle) {
					default:
						return null;
					case EQ:
						return Restrictions.eq(fieldName, x.right);
					case GE:
						return Restrictions.ge(fieldName, x.right);
					case GT:
						return Restrictions.gt(fieldName, x.right);
					case LE:
						return Restrictions.le(fieldName, x.right);
					case LT:
						return Restrictions.lt(fieldName, x.right);
					case NE:
						return Restrictions.ne(fieldName, x.right);
					}
				}).filter(x -> x != null).forEach(x -> criteria.add(x));
		}
		
		if(orderBys != null && !orderBys.isEmpty()) {
			orderBys.stream().map(x -> {
					String fieldName = x.left.getFieldName();
					switch(x.right) {
					case ASCENDING:
						return Order.asc(fieldName);
					case DESCENDING:
						return Order.desc(fieldName);
					case NONE:
					default:
						return null;
					}
				}).filter(x -> x != null).forEach(x -> criteria.addOrder(x));
		}
		
		@SuppressWarnings("unchecked")
		List<Film> films = criteria.setFirstResult((pageNumber - 1) * pageSize).setMaxResults(pageSize).list();
		
		session.close();
		return films;
	}
	
	
}
