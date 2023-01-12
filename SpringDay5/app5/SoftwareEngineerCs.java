package com.xworkz.SpringDay5.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineerCs {
	
	@Autowired
    @Qualifier("nameOfEngg")
	private String name;
    @Autowired
    @Qualifier("company")
	private String companyName;
    @Autowired
    @Qualifier("expOfEngineer")
	private int experience;
    @Autowired
    @Qualifier("salaryOfEngineer")
	private double salary;
	
	public SoftwareEngineerCs() {
		System.out.println("Creating Software engineer by spring...");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", companyName=" + companyName + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}

}
