package com.github.grommitz.dwguicey;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.jobs.JobConfiguration;

public class Config extends Configuration implements JobConfiguration {

	@JsonProperty
	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}
}
