package com.axh.media.config.contracts;

import java.util.Arrays;

import org.apache.commons.lang3.tuple.ImmutablePair;

public interface IApplicationConfigService {

	public abstract String getGroupId();

	public abstract String getName();

	public abstract String getVersion();

	public abstract String getArtifactId();

	public abstract String getJqueryVersion();

	public abstract String getBootstrapVersion();

	public abstract Iterable<ImmutablePair<String, String>> getPages();

}