package com.xworkz.springDay8.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {
		System.out.println("Calling inside petrol class");
		
	}

}
