package com.xworkz.bakeryDay7.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakeryWebMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public BakeryWebMvcInit() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("1) Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("2) Running getServletConfigClasses");
		return new Class[] { BakeryConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("3) Running getServletMappings");
		return new String[] { "/" };

	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("4) Running configureDefaultServletHandling");
		configurer.enable();
	}
}
