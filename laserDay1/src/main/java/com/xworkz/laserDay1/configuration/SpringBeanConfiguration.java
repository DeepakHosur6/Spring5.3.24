package com.xworkz.laserDay1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.laserDay1")
public class SpringBeanConfiguration {
	
	public SpringBeanConfiguration() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}

}
