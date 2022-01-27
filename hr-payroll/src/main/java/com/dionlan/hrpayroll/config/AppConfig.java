package com.dionlan.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Implementação do Design Patter Singleton para instanciação única para ter a disposição um objeto RestTemplata para ser injetado em outros serviços. 
 * @author dius_
 *
 */
@Configuration
public class AppConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
