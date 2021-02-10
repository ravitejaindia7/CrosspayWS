package com.crosspay.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
	
	  private static final String username="crosspaymt997735843";
	  private static final String password="na9dbbouacvjh3dqof9eknppa6";
	  
	  @Bean
	    RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder
	        		.basicAuthentication(username, password)
	        		.setConnectTimeout(Duration.ofMillis(30000))
		            .setReadTimeout(Duration.ofMillis(30000))
	                .build();
	    }
}
