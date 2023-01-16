package com.xworkz.springDay8.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	@Autowired
	@Qualifier("diesel")
	private Fuel fuel1;

	@Override
	public void purchase() {
		System.out.println("Inside Shell ");
		fuel.consume();
		fuel1.consume();
		
	}
	

}
