package com.axh.media.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.common.enums.SortOrder;
import com.axh.media.config.contracts.ITorrentsConfigService;
import com.axh.media.factory.viewmodel.contracts.IMovieViewModelFactory;
import com.axh.media.model.domain.Image;
import com.axh.media.model.domain.Movie;
import com.axh.media.model.mapping.MovieMapping;
import com.axh.media.model.view.MovieViewModel;
import com.axh.media.repository.contracts.ITorrentsRepository;
import com.axh.media.service.contracts.IMovieService;

@Service
public class MovieService implements IMovieService {
	
	@Autowired
	private ITorrentsRepository torrentsRepository;
	
	@Autowired
	private ITorrentsConfigService torrentsConfigService;
	
	@Autowired
	private IMovieViewModelFactory movieViewModelFactory;
	
	@Override
	public List<MovieViewModel> getAllMovies() {
		List<Movie> movies = this.torrentsRepository.getAllMovies();
		
		return this.streamMovieViewModels(movies);
	}
	
	@Override
	public List<MovieViewModel> getMoviesByPageNumber(int pageNumber, MovieMapping orderBy, boolean isDescending) {
		List<Movie> movies =  this.torrentsRepository.getMoviesByPageNumber(
				pageNumber,
				torrentsConfigService.getMoviePageSize(),
				null,
				null,
				Collections.singletonList(ImmutablePair.of(orderBy, isDescending ? SortOrder.DESCENDING : SortOrder.ASCENDING)));
		
		return this.streamMovieViewModels(movies);
	}
	
	private List<MovieViewModel> streamMovieViewModels(List<Movie> movies) {
		return movies.stream().map(x -> this.movieViewModelFactory.getMovieViewModel(x)).collect(Collectors.toList());
	}
	
	@Override
	public byte[] getMovieImage(int movieId) {
		Image image = this.torrentsRepository.getImageById(movieId);
		
		if(image == null) {
			return new byte[0];
		}
		
		return image.getImage();
	}
}
