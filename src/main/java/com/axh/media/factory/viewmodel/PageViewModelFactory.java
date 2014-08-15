package com.axh.media.factory.viewmodel;

import org.springframework.stereotype.Service;

import com.axh.media.factory.viewmodel.contracts.IPageViewModelFactory;
import com.axh.media.model.view.PageViewModel;

@Service
public class PageViewModelFactory implements IPageViewModelFactory {
	
	@Override
	public PageViewModel getPageViewModel(String name, String bootstrapVersion, String JqueryVersion) {
		PageViewModel model = new PageViewModel();
		model.setApplicationName(name);
		model.setBootstrapVersion(bootstrapVersion);
		model.setJqueryVersion(JqueryVersion);
		return model;
	}
	
}
