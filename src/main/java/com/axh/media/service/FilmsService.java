package com.axh.media.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.ITorrentsConfigService;
import com.axh.media.model.domain.Film;
import com.axh.media.repository.contracts.ITorrentsRepository;
import com.axh.media.service.contracts.IFilmsService;

@Service
public class FilmsService implements IFilmsService {
	
	@Autowired
	private ITorrentsRepository torrentsRepository;
	
	@Autowired
	private ITorrentsConfigService torrentsConfigService;
	
	
	@Override
	public List<Film> getAllFilms() {
		return this.torrentsRepository.getAllFilms();
	}
	
	@Override
	public List<Film> getFilmsByPageNumber(int pageNumber) {
		return this.torrentsRepository.getFilmsByPageNumber(pageNumber, torrentsConfigService.getFilmPageSize());
	}
}
