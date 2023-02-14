package com.xworkz.eggD9.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class EggConfiguration {
	
	public EggConfiguration() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("Registering ViewResolver ");
		//return new InternalResourceViewResolver("/", " .jsp " );
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
		
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println( "Registering LocalContainerEntityManagerFactoryBean()");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();         
		return bean;
	}
}
