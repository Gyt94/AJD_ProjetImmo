package org.descartes.services.configuration;

import org.descartes.services.IServiceBienImmobilier;
import org.descartes.services.IServiceUser;
import org.descartes.services.ServiceBienImmobilier;
import org.descartes.services.ServiceUser;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	IServiceBienImmobilier iServiceBienImmobilier() {
		return new ServiceBienImmobilier();
	}
	
	@Bean
	IServiceUser iServiceUser() {
		return new ServiceUser();
	}

}
