package com.axh.media.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.IApplicationConfigService;

@Service
public class ApplicationConfigService implements IApplicationConfigService {
	
	private static String APPLICATION_GROUPID_KEY = "application.groupId";
	private static String APPLICATION_ARTIFACTID_KEY = "application.artifactId";
	private static String APPLICATION_VERSION_KEY = "application.version";
	private static String APPLICATION_NAME_KEY = "application.name";
	
	@Autowired
	private Environment env;
	
	/* (non-Javadoc)
	 * @see com.axh.media.config.IApplicationConfigService#getGroupId()
	 */
	@Override
	public String getGroupId() {
		return this.env.getProperty(APPLICATION_GROUPID_KEY);
	}
	
	@Override
	public String getArtifactId() {
		return this.env.getProperty(APPLICATION_ARTIFACTID_KEY);
	}
	
	@Override
	public String getVersion() {
		return this.env.getProperty(APPLICATION_VERSION_KEY);
	}
	
	@Override
	public String getName() {
		return this.env.getProperty(APPLICATION_NAME_KEY);
	}
}
