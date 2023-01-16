package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Experience exp;
	public Director() {
		System.out.println("Director constructor is created");
	}

}
