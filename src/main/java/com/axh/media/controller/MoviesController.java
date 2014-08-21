package com.axh.media.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.axh.media.model.mapping.MovieMapping;
import com.axh.media.model.view.MovieViewModel;
import com.axh.media.service.contracts.IMovieService;

@Controller
@RequestMapping("/movies")
public class MoviesController extends BaseController {
	
	@Autowired
	private IMovieService movieService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView index() {
		return this.list(1);
    }
	
	@RequestMapping(value="/list/{pageNumber}", method = RequestMethod.GET)
    public ModelAndView list(@PathVariable int pageNumber) {
        ModelAndView mav = new ModelAndView();
        
        List<MovieViewModel> movies = this.movieService.getMoviesByPageNumber(1, MovieMapping.TITLE, false);
        
        mav.addObject(movies);
        
        mav.setViewName("movies/list");
        return mav;
    }
	
	@RequestMapping(value="/image/{movieId}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> image(@PathVariable int movieId) {
		
		final HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_JPEG);
		
	    byte[] image = this.movieService.getMovieImage(movieId);
	    
	    return new ResponseEntity<byte[]>(image, headers, HttpStatus.OK);
	}
	
}
