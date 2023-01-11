package com.xworkz.SpringDay4.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() {
		System.out.println("Creating season by spring...");
	}

	public String getName() {
		return name;
	}

	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	@Value("3 months")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("March")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
