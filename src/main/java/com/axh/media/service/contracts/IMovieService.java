package com.axh.media.service.contracts;

import java.util.List;

import com.axh.media.model.domain.Image;
import com.axh.media.model.mapping.MovieMapping;
import com.axh.media.model.view.MovieViewModel;

public interface IMovieService {

	public abstract List<MovieViewModel> getAllMovies();

	public abstract List<MovieViewModel> getMoviesByPageNumber(int pageNumber, MovieMapping orderBy, boolean isDescending);

	public abstract byte[] getMovieImage(int movieId);

}