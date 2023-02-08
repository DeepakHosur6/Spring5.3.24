package com.xworkz.deepakDay5.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class DeepakMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public DeepakMvcInit() {
		System.out.println("Constructor is Created...... " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("1) Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("2) Running getServletConfigClasses");
	//	Class[] ref = {DeepakConfiguration.class};
		return new Class[]  {DeepakConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("3) Running getServletMappings");
		/*
		 * String[] ref2 = { "/" };
		 *  System.out.println(Arrays.toString(ref2));
		 */
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("4) Running configureDefaultServletHandling");
		configurer.enable();
	}

}
