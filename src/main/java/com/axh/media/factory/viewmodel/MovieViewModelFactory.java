package com.axh.media.factory.viewmodel;

import org.springframework.stereotype.Service;

import com.axh.media.factory.viewmodel.contracts.IMovieViewModelFactory;
import com.axh.media.model.domain.Movie;
import com.axh.media.model.view.MovieViewModel;

@Service
public class MovieViewModelFactory implements IMovieViewModelFactory {
	
	/* (non-Javadoc)
	 * @see com.axh.media.factory.viewmodel.IFilmViewModelFactory#getFilmViewModel(com.axh.media.model.domain.Film)
	 */
	@Override
	public MovieViewModel getMovieViewModel(Movie movie) {
		MovieViewModel model = new MovieViewModel();
		
		model.setFilmId(movie.getFilmId());
		model.setTitle(movie.getTitle());
		model.setReleaseYear(movie.getYear());
		model.setTorrent(movie.getTorrent());
		model.setLink(movie.getLink());
		model.setImdb(movie.getImdb());
		model.setRating(movie.getRating());
		model.setGenre(movie.getGenre());
		model.setSize(movie.getSize());
		model.setRunTime(movie.getRunTime());
		model.setSynopsis(movie.getSynopsis());
		model.setImageUrl(movie.getImage().getImageUrl());
		model.setImage(movie.getImage().getImage());
		
		return model;
	}
	
}
