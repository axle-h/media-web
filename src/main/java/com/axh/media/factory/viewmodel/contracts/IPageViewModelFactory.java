package com.axh.media.factory.viewmodel.contracts;

import com.axh.media.model.view.PageViewModel;

public interface IPageViewModelFactory {

	public abstract PageViewModel getPageViewModel(String name, String bootstrapVersion,
			String JqueryVersion);

}