package com.axh.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.axh.media.service.contracts.IFilmsService;

@Controller
@RequestMapping("/movies")
public class MoviesController extends BaseController {
	
	@Autowired
	private IFilmsService filmsService;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
		
		//for(Film film : this.filmsService.getFilmsByPageNumber(1)) {
		//	System.out.println(film.getTitle());
		//}
		
        ModelAndView mav = new ModelAndView();
        mav.setViewName("movies/index");
        return mav;
    }
	
}
