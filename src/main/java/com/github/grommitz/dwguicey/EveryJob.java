package com.github.grommitz.dwguicey;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Every("5s")
public class EveryJob extends Job {

	private final static Logger logger = LoggerFactory.getLogger(EveryJob.class);
	private final String injectedValue;

	@Inject
	public EveryJob(@Named("everyMessage") String injectedValue) {
		this.injectedValue = injectedValue;
	}

	@Override
	public void doJob(JobExecutionContext jobExecutionContext) {
		logger.info("injectedValue = {}", injectedValue);
		// do work here....
	}

}
