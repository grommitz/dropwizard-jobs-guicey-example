package com.github.grommitz.dwguicey;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.OnApplicationStop;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OnApplicationStop
public class StopJob extends Job {

	private final static Logger logger = LoggerFactory.getLogger(StopJob.class);
	private final String injectedValue;

	@Inject
	public StopJob(@Named("terminationMessage") String injectedValue) {
		this.injectedValue = injectedValue;
	}

	@Override
	public void doJob(JobExecutionContext jobExecutionContext) {
		logger.info("injectedValue = {}", injectedValue);
		// do work here....
	}

}
