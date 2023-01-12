package com.xworkz.SpringDay5.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfo{
	
	@Autowired
	@Qualifier("idOfPerson")
	private byte id;
	@Autowired
	@Qualifier("ageOfPerson")
	private short age ;
	@Autowired
	@Qualifier("nameOfPerson")
	private String name;
	@Autowired
	@Qualifier("expOfPerson")
	private int experience;
	@Autowired
	@Qualifier("mobileNoo")
	private long mobileNo;
	@Autowired
	@Qualifier("salaryOfPerson")
	private double salary;
	@Autowired
	@Qualifier("heightOfPerson")
	private float height ;
	@Autowired
	@Qualifier("isAliveOrNot")
	private boolean isAlive;
	@Autowired
	@Qualifier("chr")
	private char ch;
	
	
	public PersonalInfo() {
		System.out.println("Created PersonalData by spring...");
	}


	@Override
	public String toString() {
		return "PersonalData [id=" + id + ", age=" + age + ", name=" + name + ", experience=" + experience
				+ ", mobileNo=" + mobileNo + ", salary=" + salary + ", height=" + height + ", isAlive=" + isAlive
				+ ", ch=" + ch + "]";
	}

}
