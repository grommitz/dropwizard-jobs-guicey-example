package com.github.grommitz.dwguicey;

import com.google.inject.Provides;
import com.google.inject.name.Named;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

public class MyGuiceModule extends DropwizardAwareModule {

	@Provides
	@Named("myProp")
	public String provideSsoEndpointUrl(Config config) {
		return config.getMyProperty();
	}
}
