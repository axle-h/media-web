package com.axh.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.axh.media.model.view.PageViewModel;
import com.axh.media.service.viewmodel.contracts.IPageViewModelService;

public abstract class BaseController {
	
	@Autowired
	private IPageViewModelService pageViewModelService;
	
	@ModelAttribute
	public PageViewModel getPageViewModel() {
		return pageViewModelService.getPageViewModel();
	}
	
}
