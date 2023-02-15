package com.xworkz.valentine.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.valentine")
public class ValentineConfiguration {

	public ValentineConfiguration() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering Custom View Resolver ");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
