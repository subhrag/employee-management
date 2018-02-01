package com.subhra.employee.management.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.subhra.employee.management", 
						exclude = {ErrorMvcAutoConfiguration.class})
public class SpringBootWebApplicationInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootWebApplicationInitializer.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplicationInitializer.class, args);
	}
}

