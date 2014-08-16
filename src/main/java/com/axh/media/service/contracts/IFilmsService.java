package com.axh.media.service.contracts;

import java.util.List;

import com.axh.media.model.mapping.FilmMapping;
import com.axh.media.model.view.FilmViewModel;

public interface IFilmsService {

	public abstract List<FilmViewModel> getAllFilms();

	public abstract List<FilmViewModel> getFilmsByPageNumber(int pageNumber, FilmMapping orderBy, boolean isDescending);

	public abstract List<FilmViewModel> getFilmsByPageNumber(int pageNumber, FilmMapping orderBy,
			boolean isDescending, String quality);

}