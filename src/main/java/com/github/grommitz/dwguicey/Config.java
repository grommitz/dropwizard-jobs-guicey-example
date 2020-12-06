package com.github.grommitz.dwguicey;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.jobs.JobConfiguration;

public class Config extends Configuration implements JobConfiguration {

	@JsonProperty
	private String startupMessage;

	@JsonProperty
	private String terminationMessage;

	@JsonProperty
	private String everyMessage;

	@JsonProperty
	private String onMessage;

	public String getOnMessage() {
		return onMessage;
	}

	public void setOnMessage(String onMessage) {
		this.onMessage = onMessage;
	}

	public String getEveryMessage() {
		return everyMessage;
	}

	public void setEveryMessage(String everyMessage) {
		this.everyMessage = everyMessage;
	}

	public String getTerminationMessage() {
		return terminationMessage;
	}

	public void setTerminationMessage(String terminationMessage) {
		this.terminationMessage = terminationMessage;
	}

	public String getStartupMessage() {
		return startupMessage;
	}

	public void setStartupMessage(String startupMessage) {
		this.startupMessage = startupMessage;
	}
}
