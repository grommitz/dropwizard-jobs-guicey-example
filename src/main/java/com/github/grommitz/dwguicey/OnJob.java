package com.github.grommitz.dwguicey;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.DelayStart;
import io.dropwizard.jobs.annotations.On;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DelayStart("2s")
@On("0/5 * * * * ?")
public class OnJob extends Job {

	private final static Logger logger = LoggerFactory.getLogger(OnJob.class);
	private final String injectedValue;

	@Inject
	public OnJob(@Named("onMessage") String injectedValue) {
		this.injectedValue = injectedValue;
	}

	@Override
	public void doJob(JobExecutionContext jobExecutionContext) {
		logger.info("injectedValue = {}", injectedValue);
		// do work here....
	}

}
