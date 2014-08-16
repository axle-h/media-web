package com.axh.media.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.common.enums.LogicalOperation;
import com.axh.common.enums.SortOrder;
import com.axh.media.config.contracts.ITorrentsConfigService;
import com.axh.media.factory.viewmodel.contracts.IFilmViewModelFactory;
import com.axh.media.model.domain.Film;
import com.axh.media.model.mapping.FilmMapping;
import com.axh.media.model.view.FilmViewModel;
import com.axh.media.repository.contracts.ITorrentsRepository;
import com.axh.media.service.contracts.IFilmsService;

@Service
public class FilmsService implements IFilmsService {
	
	@Autowired
	private ITorrentsRepository torrentsRepository;
	
	@Autowired
	private ITorrentsConfigService torrentsConfigService;
	
	@Autowired
	private IFilmViewModelFactory filmViewModelFactory;
	
	@Override
	public List<FilmViewModel> getAllFilms() {
		List<Film> films = this.torrentsRepository.getAllFilms();
		
		return this.streamFilmViewModels(films);
	}
	
	@Override
	public List<FilmViewModel> getFilmsByPageNumber(int pageNumber, FilmMapping orderBy, boolean isDescending) {
		List<Film> films =  this.torrentsRepository.getFilmsByPageNumber(
				pageNumber,
				torrentsConfigService.getFilmPageSize(),
				null,
				null,
				Collections.singletonList(ImmutablePair.of(orderBy, isDescending ? SortOrder.DESCENDING : SortOrder.ASCENDING)));
		
		return this.streamFilmViewModels(films);
	}
	
	@Override
	public List<FilmViewModel> getFilmsByPageNumber(int pageNumber, FilmMapping orderBy, boolean isDescending, String quality) {
		List<Film> films = this.torrentsRepository.getFilmsByPageNumber(
				pageNumber,
				torrentsConfigService.getFilmPageSize(),
				null,
				Collections.singletonList(ImmutableTriple.of(FilmMapping.QUALITY, LogicalOperation.EQ, (Object)quality)),
				Collections.singletonList(ImmutablePair.of(orderBy, isDescending ? SortOrder.DESCENDING : SortOrder.ASCENDING)));
		
		return this.streamFilmViewModels(films);
	}
	
	private List<FilmViewModel> streamFilmViewModels(List<Film> films) {
		return films.stream().map(x -> this.filmViewModelFactory.getFilmViewModel(x)).collect(Collectors.toList());
	}
}
