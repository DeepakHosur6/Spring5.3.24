package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location loc;
	
	public Company() {

		System.out.println("Location constructor is Created ");
	}

}
