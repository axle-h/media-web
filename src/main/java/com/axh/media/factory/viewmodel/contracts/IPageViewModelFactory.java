package com.axh.media.factory.viewmodel.contracts;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;

import com.axh.media.model.view.PageViewModel;

public interface IPageViewModelFactory {

	PageViewModel getPageViewModel(String name, String bootstrapVersion,
			String jqueryVersion, List<ImmutablePair<String, String>> links);

}