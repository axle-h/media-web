package com.axh.media.repository.contracts;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;

import com.axh.common.enums.LogicalOperation;
import com.axh.common.enums.SortOrder;
import com.axh.media.model.domain.Movie;
import com.axh.media.model.mapping.MovieMapping;

public interface ITorrentsRepository {

	public Movie getMovieById(int id);

	public Movie getMovieByTitle(String title);

	public List<Movie> getAllMovies();

	public abstract List<Movie> getMoviesByPageNumber(int pageNumber, int pageSize);

	public abstract List<Movie> getMoviesByPageNumber(int pageNumber, int pageSize,
			List<MovieMapping> projections, List<ImmutableTriple<MovieMapping, LogicalOperation, Object>> conditions, List<ImmutablePair<MovieMapping, SortOrder>> orderBys);

}