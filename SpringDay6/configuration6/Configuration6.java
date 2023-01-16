package com.xworkz.SpringDay6.configuration6;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.SpringDay6.app.Type;

@Configuration
@ComponentScan("com.xworkz")
public class Configuration6 {

	public Configuration6() {
		System.out.println("Inside Configuration6() ");
	}

	@Bean
	public String paperName() {
		System.out.println("----Task 1----");
		System.out.println("Inside paperName()");
		return "IndianTime";
	}

	@Bean
	public String ownerName() {
		System.out.println("Inside ownerName()");
		return "Tommy";
	}

	@Bean
	public String sName() {
		return "king Cobra";
	}

	@Bean
	public String type() {

		return "Male";
	}

	@Bean
	public Boolean poision() {

		return true;
	}
	
	@Bean
	public String engName()
	{
		return "india";
	}

	
	  @Bean
	  public Type etype()
	  {
		  return Type.big;
	  }
	 

	@Bean
	public String ecompany()
	{
		return "Mahindra";
	}

	@Bean
	public String stroke()
	{
		return "no stroke";
	}
}
