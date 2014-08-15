package com.axh.media.service.viewmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.IApplicationConfigService;
import com.axh.media.model.view.PageViewModel;
import com.axh.media.service.viewmodel.contracts.IPageViewModelService;

@Service
public class PageViewModelService implements IPageViewModelService {
	
	@Autowired
	private IApplicationConfigService applicationConfigService;
	
	private IPageViewModelService pageViewModelFactory;
	
	@Override
	public PageViewModel getPageViewModel() {
		String name = this.applicationConfigService.getName();
		String bootstrapVersion = this.applicationConfigService.getBootstrapVersion();
		String jqueryVersion = this.applicationConfigService.getJqueryVersion();
		
		
		
		return model;
	}
	
}
