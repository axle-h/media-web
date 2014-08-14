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
	
	private static String APPLICATION_BOOTSTRAP_VERSION = "application.bootstrap.version";
	private static String APPLICATION_JQUERY_VERSION = "application.jquery.version";
	
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
	
	@Override
	public String getBootstrapVersion() {
		return this.env.getProperty(APPLICATION_BOOTSTRAP_VERSION);
	}
	
	@Override
	public String getJqueryVersion() {
		return this.env.getProperty(APPLICATION_JQUERY_VERSION);
	}
}
