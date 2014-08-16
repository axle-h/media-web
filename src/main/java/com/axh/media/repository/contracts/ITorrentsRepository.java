package com.axh.media.repository.contracts;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.axh.common.enums.LogicalOperation;
import com.axh.common.enums.SortOrder;
import com.axh.media.model.domain.Film;
import com.axh.media.model.mapping.FilmMapping;

public interface ITorrentsRepository {

	public Film getFilmById(int id);

	public Film getFilmByTitle(String title);

	public List<Film> getAllFilms();

	public abstract List<Film> getFilmsByPageNumber(int pageNumber, int pageSize);

	public abstract List<Film> getFilmsByPageNumber(int pageNumber, int pageSize,
			List<FilmMapping> projections, List<ImmutableTriple<FilmMapping, LogicalOperation, Object>> conditions, List<ImmutablePair<FilmMapping, SortOrder>> orderBys);

}