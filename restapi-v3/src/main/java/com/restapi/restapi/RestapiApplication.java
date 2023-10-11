package com.restapi.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestapiApplication extends SpringBootServletInitializer {

	// In case of WAR we extend SpringBootServletInitializer
	public static void main(String[] args){

		SpringApplication.run(RestapiApplication.class, args);
	}

	// In case of WAR: Providing instructions to the servlet container on how to initialize
	// your Spring Boot application when it is deployed as a WAR file.
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RestapiApplication.class);
	}

}
