package com.axh.media.service.viewmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.IApplicationConfigService;
import com.axh.media.model.view.PageViewModel;
import com.axh.media.service.contracts.viewmodel.IPageViewModelService;

@Service
public class PageViewModelService implements IPageViewModelService {
	
	@Autowired
	private IApplicationConfigService applicationConfigService;
	
	@Override
	public PageViewModel getPageViewModel() {
		PageViewModel model = new PageViewModel();
		model.setApplicationName(this.applicationConfigService.getName());
		model.setBootstrapVersion(this.applicationConfigService.getBootstrapVersion());
		model.setJqueryVersion(this.applicationConfigService.getJqueryVersion());
		return model;
	}
	
}
