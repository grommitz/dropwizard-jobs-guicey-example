package com.github.grommitz.dwguicey;

import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.Every;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.debug.util.RenderUtils;
import ru.vyarus.dropwizard.guice.module.installer.FeatureInstaller;
import ru.vyarus.dropwizard.guice.module.installer.install.InstanceInstaller;
import ru.vyarus.dropwizard.guice.module.installer.util.FeatureUtils;
import ru.vyarus.dropwizard.guice.module.installer.util.Reporter;

public class GuiceyInstaller implements FeatureInstaller, InstanceInstaller<Job> {

	private final Reporter reporter = new Reporter(GuiceyInstaller.class, "jobs =");

	@Override
	public boolean matches(Class<?> type) {
		return FeatureUtils.hasAnnotation(type, Every.class);
	}

	@Override
	public void report() {
		reporter.report();
	}

	@Override
	public void install(Environment environment, Job job) {
		reporter.line(RenderUtils.renderClassLine(FeatureUtils.getInstanceClass(job)));
		environment.jersey().register(job);
	}

}
