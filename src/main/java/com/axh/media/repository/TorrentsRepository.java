package com.axh.media.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.axh.media.model.domain.Film;
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
	
	
}
