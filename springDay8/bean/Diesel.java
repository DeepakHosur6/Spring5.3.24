package com.xworkz.springDay8.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	@Override
	public void consume() {
		System.out.println("Calling Inside Disel()");
		
	}

}
