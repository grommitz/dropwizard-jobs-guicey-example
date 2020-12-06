package com.github.grommitz.dwguicey;

import com.google.inject.Provides;
import com.google.inject.name.Named;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

public class MyGuiceModule extends DropwizardAwareModule {

	@Provides
	@Named("onMessage")
	public String getOnMessage(Config config) {
		return config.getOnMessage();
	}

	@Provides
	@Named("everyMessage")
	public String getEveryMessage(Config config) {
		return config.getEveryMessage();
	}

	@Provides
	@Named("startupMessage")
	public String getStartupMessage(Config config) {
		return config.getStartupMessage();
	}

	@Provides
	@Named("terminationMessage")
	public String getTerminationMessage(Config config) {
		return config.getTerminationMessage();
	}

}
