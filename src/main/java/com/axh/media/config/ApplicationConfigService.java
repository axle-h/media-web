package com.axh.media.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.axh.media.config.contracts.IApplicationConfigService;

@Service
public class ApplicationConfigService implements IApplicationConfigService {
	
	private static final String APPLICATION_GROUPID_KEY = "application.groupId";
	private static final String APPLICATION_ARTIFACTID_KEY = "application.artifactId";
	private static final String APPLICATION_VERSION_KEY = "application.version";
	private static final String APPLICATION_NAME_KEY = "application.name";
	
	private static final String APPLICATION_BOOTSTRAP_VERSION = "application.bootstrap.version";
	private static final String APPLICATION_JQUERY_VERSION = "application.jquery.version";
	
	private static final String APPLICATION_LINKS = "application.links";
	
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
	
	@Override
	public List<ImmutablePair<String, String>> getPages() {
		return Arrays.stream(this.env.getProperty(APPLICATION_LINKS).split(";"))
				.map(x -> x.split(","))
				.filter(x -> x.length == 2)
				.map(x -> ImmutablePair.of(x[0], x[1]))
				.collect(Collectors.toList());
	}
}
