package com.xworkz.SpringDay4.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String country;
	@Value("Aryabhata")
	private String name;
	@Value("30000000.0")
	private double budget;

	public String getCountry() {
		return country;
	}

	public Rocket() {
		System.out.println("Created Rocket by spring...");
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

}
