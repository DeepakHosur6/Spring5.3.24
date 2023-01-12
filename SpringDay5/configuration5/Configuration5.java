package com.xworkz.SpringDay5.configuration5;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringDay5")
public class Configuration5 {
	
	@Bean
	public String roleName() {
		System.out.println("registering role");
		return "SoftwareEngineer";
	}
	
	@Bean
	public int years() {
		System.out.println("registering years..");
		int ref = 16;
		return ref;
	}
	
	@Bean
	public String companyName() {
		System.out.println("registering company name...");
		return "Infosys";
	}
	
	///////////////////////////////////////////////////////////////
	
	@Bean
	public String nameOfGovt() {
		System.out.println("===================================");
		System.out.println("registering name...");
		return "BJP";
	}
	
	@Bean 
	public String nameOfPresident() {
		System.out.println("registering president name..");
		return "Raj";
		
	}
	
	@Bean
	public double tenuree() {
		System.out.println("registering tenure..");
		return 6.0;
	}
	
	@Bean 
	public int members() {
		System.out.println("registering members..");
		return 224;
	}
	
	@Bean
	public boolean majorityCheck() {
		System.out.println("registering majority...");
		return true;
	}
	
    
	
	
	@Bean 
	public int idValue() {
		System.out.println("===================================");
		System.out.println("registering id value..");
		return 201;
	}
	
	@Bean 
	public String nameOfHardware() {
		System.out.println("registering name...");
		return "Key";
	}
	
	@Bean
	public double number() {
		System.out.println("registering gst number...");
		return 233.5;
	}
	
	@Bean
	public String owner() {
		System.out.println("registering owner name..");
		return "Allen";
	}
	
	@Bean
	public String addresss() {
		System.out.println("registering address...");
		return "BTM";
	}
	
    
	
	
	@Bean
	public String nameOfSoftware() {
		System.out.println("===================================");
		System.out.println("registering name...");
		return "Eclipse";
	}
	
	
	@Bean
	public String developerName() {
		System.out.println("registering developer name...");
		return "Sandy";
	}
	
	@Bean
	public LocalDate datee() {
		System.out.println("registering date..");
		return LocalDate.of(2009, 8, 03);
	}
	
	@Bean 
	public boolean freeSoftware() {
		System.out.println("registering free...");
		return true;
	}
	
     
	
	
	@Bean
	public String nameOfPencil() {
		System.out.println("===================================");
		System.out.println("registering name..");
		return "Maruti";
	}
	
	@Bean
	public String typeOfPencil() {
		System.out.println("registering type..");
		return "Led";
	}
	
	@Bean
	public double priceOfPencil() {
		System.out.println("registering price..");
		return 200;
	}
	
	@Bean
	public String color() {
		System.out.println("===================================");
		System.out.println("registering color..");
		return "Blue";
	}
	
	@Bean
	public boolean sharpp() {
		System.out.println("registering sharp..");
		return true;
	}
	
	@Bean
	public boolean stolenn() {
		System.out.println("registering stolen..");
		return false;
	}
	
     
	
	@Bean
	public String nameOfRubber() {
		System.out.println("===================================");
		System.out.println("registering name..");
		return "Pavan";
	}
	
	@Bean
	public String typeOfRubber() {
		System.out.println("registering type..");
		return "wood";
	}
	
	@Bean
	public double priceOfRubber() {
		System.out.println("registering price..");
		return 21;
	}
	
	@Bean
	public String colorOfRubber() {
		System.out.println("registering color..");
		return "Black";
	}
	
	@Bean
	public String shapeOfRubber() {
		System.out.println("===================================");
		System.out.println("registering shape..");
		return "Rectangle";
	}
	
	@Bean
	public boolean stolennn() {
		System.out.println("registering stolen..");
		return false;
	}
	
	@Bean
	public String sizeOfRubber() {
		System.out.println("registering size..");
		return "small";
	}
	
    
	
	
	@Bean
	public String nameOfEngg() {
		System.out.println("===================================");
		System.out.println("registering name..");
		return "Shreya";
	}
	
	@Bean
	public String company() {
		System.out.println("registering company..");
		return "Liberty Hotel";
	}
	
	@Bean
	public int expOfEngineer() {
		System.out.println("registering experience..");
		return 1 ;
	}
	
	@Bean
	public double salaryOfEngineer() {
		System.out.println("registering salary..");
		return 40500.00 ;
	}
	
     
	
	
	@Bean
	public byte idOfPerson() {
		System.out.println("===================================");
		System.out.println("registering id..");
		return 10;
	}
	
	@Bean
	public short ageOfPerson() {
		System.out.println("registering age..");
		return 26;
	}
	
	@Bean
	public String nameOfPerson() {
		System.out.println("registering name..");
		return "Alexa";
	}
	
	@Bean
	public int expOfPerson() {
		System.out.println("registering exp..");
		return 11;
	}
	
	@Bean
	public long mobileNoo() {
		System.out.println("registering mobile no..");
		return 9944662211L;
	}
	
	@Bean
	public double salaryOfPerson() {
		System.out.println("registering salary..");
		return 40500.00;
	}
	
	@Bean
	public float heightOfPerson() {
		System.out.println("registering height..");
		return 3.9F;
	}
	
	@Bean
	public boolean isAliveOrNot() {
		System.out.println("registering alive..");
		return true;
	}
	
	@Bean
	public char chr() {
		System.out.println("registering char..");
		return 'l';
	}

}
