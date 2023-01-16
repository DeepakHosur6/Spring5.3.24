package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity cap;
	
	public Battery() {
		System.out.println("Battery created");
	}

}
