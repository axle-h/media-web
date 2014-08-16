package com.axh.media.repository.contracts;

import java.util.List;

import com.axh.media.model.domain.Film;

public interface ITorrentsRepository {

	public Film getFilmById(int id);

	public Film getFilmByTitle(String title);

	public List<Film> getAllFilms();

	public abstract List<Film> getFilmsByPageNumber(int pageNumber, int pageSize);

}