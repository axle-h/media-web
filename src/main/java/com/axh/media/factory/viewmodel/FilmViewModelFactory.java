package com.axh.media.factory.viewmodel;

import org.springframework.stereotype.Service;

import com.axh.media.factory.viewmodel.contracts.IFilmViewModelFactory;
import com.axh.media.model.domain.Film;
import com.axh.media.model.view.FilmViewModel;

@Service
public class FilmViewModelFactory implements IFilmViewModelFactory {
	
	/* (non-Javadoc)
	 * @see com.axh.media.factory.viewmodel.IFilmViewModelFactory#getFilmViewModel(com.axh.media.model.domain.Film)
	 */
	@Override
	public FilmViewModel getFilmViewModel(Film film) {
		FilmViewModel model = new FilmViewModel();
		
		model.setFilmId(film.getFilmId());
		model.setTitle(film.getTitle());
		model.setReleaseYear(film.getReleaseYear());
		model.setPublished(film.getPublished());
		model.setTorrent(film.getTorrent());
		model.setLink(film.getLink());
		model.setImdbLink(film.getImdbLink());
		model.setImdbRating(film.getImdbRating());
		model.setGenre(film.getGenre());
		model.setQuality(film.getQuality());
		model.setSize(film.getSize());
		model.setRunTime(film.getRunTime());
		model.setSynopsis(film.getSynopsis());
		model.setImageUrl(film.getImageUrl());
		model.setImage(film.getImage());
		
		return model;
	}
	
}
