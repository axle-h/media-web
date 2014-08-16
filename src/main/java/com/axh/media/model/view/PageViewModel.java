package com.axh.media.model.view;

import java.util.Calendar;
import java.util.List;

public class PageViewModel {
	
	public Calendar date;
	
	private String applicationName;
	
	private String bootstrapVersion;
	
	private String jqueryVersion;
	
	private List<LinkViewModel> links;

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

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
	public List<LinkViewModel> getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(List<LinkViewModel> links) {
		this.links = links;
	}
	
}
