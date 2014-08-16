package com.axh.media.factory.viewmodel.contracts;

import com.axh.media.model.domain.Film;
import com.axh.media.model.view.FilmViewModel;

public interface IFilmViewModelFactory {

	public FilmViewModel getFilmViewModel(Film film);

}