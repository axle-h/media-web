package com.axh.media.service.viewmodel;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.IApplicationConfigService;
import com.axh.media.factory.viewmodel.contracts.IPageViewModelFactory;
import com.axh.media.model.view.PageViewModel;
import com.axh.media.service.viewmodel.contracts.IPageViewModelService;

@Service
public class PageViewModelService implements IPageViewModelService {
	
	@Autowired
	private IApplicationConfigService applicationConfigService;
	
	@Autowired
	private IPageViewModelFactory pageViewModelFactory;
	
	@Override
	public PageViewModel getPageViewModel() {
		String name = this.applicationConfigService.getName();
		String bootstrapVersion = this.applicationConfigService.getBootstrapVersion();
		String jqueryVersion = this.applicationConfigService.getJqueryVersion();
		List<ImmutablePair<String, String>> links = this.applicationConfigService.getPages();
		return this.pageViewModelFactory.getPageViewModel(name, bootstrapVersion, jqueryVersion, links);
	}
	
}
