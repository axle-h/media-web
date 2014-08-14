package com.axh.media.model.view;

public class PageViewModel {
	
	private String applicationName;
	
	private String bootstrapVersion;
	
	private String jqueryVersion;
	
	private Iterable<LinkViewModel> links;

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the bootstrapVersion
	 */
	public String getBootstrapVersion() {
		return bootstrapVersion;
	}

	/**
	 * @param bootstrapVersion the bootstrapVersion to set
	 */
	public void setBootstrapVersion(String bootstrapVersion) {
		this.bootstrapVersion = bootstrapVersion;
	}

	/**
	 * @return the jqueryVersion
	 */
	public String getJqueryVersion() {
		return jqueryVersion;
	}

	/**
	 * @param jqueryVersion the jqueryVersion to set
	 */
	public void setJqueryVersion(String jqueryVersion) {
		this.jqueryVersion = jqueryVersion;
	}

	/**
	 * @return the links
	 */
	public Iterable<LinkViewModel> getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(Iterable<LinkViewModel> links) {
		this.links = links;
	}
	
}
