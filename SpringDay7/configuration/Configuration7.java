package com.xworkz.SpringDay7.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringDay7")
public class Configuration7 {
	
	public Configuration7() {
		System.out.println("Constructor is created in Configuration7 using Spring");
	}

}
