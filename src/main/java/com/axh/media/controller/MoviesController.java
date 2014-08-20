package com.axh.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
		
		for(MovieViewModel movie : this.movieService.getMoviesByPageNumber(1, MovieMapping.TITLE, false)) {
			System.out.println(movie.getTitle());
		}
		
        ModelAndView mav = new ModelAndView();
        mav.setViewName("movies/index");
        return mav;
    }
	
}
