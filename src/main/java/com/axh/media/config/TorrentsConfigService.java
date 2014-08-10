package com.axh.media.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.ITorrentsConfigService;

@Service
public class TorrentsConfigService implements ITorrentsConfigService {
	
	private static String APPLICATION_TORRENTS_PAGE_SIZE_KEY = "com.axh.media.config.torrents.films-page-size";
	
	@Autowired
	private Environment env;
	
	/* (non-Javadoc)
	 * @see com.axh.media.config.ITorrentsConfigService#getFilmPageSize()
	 */
	@Override
	public int getFilmPageSize() {
		return env.getProperty(APPLICATION_TORRENTS_PAGE_SIZE_KEY, Integer.class).intValue();
	}
}
