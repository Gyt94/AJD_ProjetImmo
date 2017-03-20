package org.descartes.services.configuration;

import org.descartes.services.IServiceBienImmobilier;
import org.descartes.services.ServiceBienImmobilier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	IServiceBienImmobilier iServiceBienImmobilier() {
		return new ServiceBienImmobilier();
	}

}
