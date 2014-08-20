package com.axh.media.factory.viewmodel.contracts;

import com.axh.media.model.domain.Movie;
import com.axh.media.model.view.MovieViewModel;

public interface IMovieViewModelFactory {

	public MovieViewModel getMovieViewModel(Movie movie);

}