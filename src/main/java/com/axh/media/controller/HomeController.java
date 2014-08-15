package com.axh.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.axh.media.config.contracts.IApplicationConfigService;
import com.axh.media.service.contracts.IFilmsService;
import com.axh.media.service.viewmodel.contracts.IPageViewModelService;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

	@Autowired
	private IFilmsService filmsService;
	
	
	
	@RequestMapping("/")
    public ModelAndView helloWorld() {
		
		//for(Film film : this.filmsService.getFilmsByPageNumber(1)) {
		//	System.out.println(film.getTitle());
		//}
		
		
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/home");
        return mav;
    }
}
