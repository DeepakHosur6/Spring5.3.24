package com.xworkz.deepakDay5.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.deepakDay5")
public class DeepakConfiguration {
	
	public DeepakConfiguration() {
		System.out.println("Constructor is Created in :  " + this.getClass().getSimpleName());
	}
}
