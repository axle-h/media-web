package com.axh.media.factory.viewmodel;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.stereotype.Service;

import com.axh.media.factory.viewmodel.contracts.IPageViewModelFactory;
import com.axh.media.model.view.LinkViewModel;
import com.axh.media.model.view.PageViewModel;

@Service
public class PageViewModelFactory implements IPageViewModelFactory {
	
	@Override
	public PageViewModel getPageViewModel(String name, String bootstrapVersion, String jqueryVersion, List<ImmutablePair<String, String>> links) {
		PageViewModel model = new PageViewModel();
		model.setApplicationName(name);
		model.setBootstrapVersion(bootstrapVersion);
		model.setJqueryVersion(jqueryVersion);
		model.setDate(Calendar.getInstance());
		
		List<LinkViewModel> linkModels = links.stream().map(x -> getLinksViewModel(x)).filter(x -> x != null).collect(Collectors.toList());
		model.setLinks(linkModels);
		
		return model;
	}
	
	private static LinkViewModel getLinksViewModel(ImmutablePair<String, String> urlNamePair) {
		if(urlNamePair == null) {
			return null;
		}
		
		LinkViewModel model = new LinkViewModel();
		model.setUrl(urlNamePair.left);
		model.setName(urlNamePair.right);
		return model;
	}
	
}
