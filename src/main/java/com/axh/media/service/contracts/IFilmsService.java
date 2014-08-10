package com.axh.media.service.contracts;

import java.util.List;

import com.axh.media.model.domain.Film;

public interface IFilmsService {

	public abstract List<Film> getAllFilms();

	public abstract List<Film> getFilmsByPageNumber(int pageNumber);

}