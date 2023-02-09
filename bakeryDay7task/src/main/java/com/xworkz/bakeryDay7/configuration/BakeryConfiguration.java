package com.xworkz.bakeryDay7.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakeryDay7")
public class BakeryConfiguration {

	public BakeryConfiguration() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp"); // prefix, suffix

		return resolver;

	}

}
