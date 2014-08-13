package com.axh.media.config.contracts;

public interface IApplicationConfigService {

	public abstract String getGroupId();

	public abstract String getName();

	public abstract String getVersion();

	public abstract String getArtifactId();

}