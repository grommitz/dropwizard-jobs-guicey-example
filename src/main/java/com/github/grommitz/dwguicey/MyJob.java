package com.github.grommitz.dwguicey;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Every("5s")
public class MyJob extends Job {

	private final static Logger logger = LoggerFactory.getLogger(MyJob.class);
	private final String val;

	@Inject
	public MyJob(@Named("myProp") String val) {
		this.val = val;
	}

	@Override
	public void doJob(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		logger.info("running with injected value: {}", val);
		// do work....
	}

}
