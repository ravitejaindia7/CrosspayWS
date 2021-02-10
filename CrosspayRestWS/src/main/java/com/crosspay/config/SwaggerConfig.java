package com.crosspay.config;

import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
				.basePackage("com.crosspay.controller"))
				.paths(PathSelectors.any()).build().apiInfo(metaData());
	}
	 private ApiInfo metaData() {
		 ApiInfo apiInfo = new ApiInfo(
               "REST API for Cross Pay Money Conversion Application",
               "Developed by: RAVITEJA",
               "Version-V1.0",
               "Terms of service",
               new Contact("Cross Pay Services", "", ""),
               "Cross Pay Version 1.0",
               "", new Vector<>());
       return apiInfo;
	    }
}
