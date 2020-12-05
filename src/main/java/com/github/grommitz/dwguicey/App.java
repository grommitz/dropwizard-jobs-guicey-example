package com.github.grommitz.dwguicey;

import io.dropwizard.Application;
import io.dropwizard.jobs.GuiceJobManager;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class App extends Application<Config> {

	private GuiceBundle guiceBundle;

	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public void run(Config config, Environment environment) {
		GuiceJobManager jobManager = new GuiceJobManager(config, guiceBundle.getInjector());
		environment.lifecycle().manage(jobManager);
	}

	@Override
	public void initialize(Bootstrap<Config> bootstrap) {

		MyGuiceModule myModule = new MyGuiceModule();

		guiceBundle = GuiceBundle.builder()
				.enableAutoConfig( "com.github.grommitz.dwguicey" )
				.modules( myModule )
				.printGuiceBindings()
				.build();

		bootstrap.addBundle( guiceBundle );
	}

}
