package com.xworkz.SpringDay5.app5;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("nameOfSoftware")
	private String name;
	
	@Autowired
	@Qualifier("developerName")
	private String developer;
	@Autowired
	private LocalDate date;
	@Autowired
	@Qualifier("freeSoftware")
	private boolean free;

	public Software() {
		System.out.println("Created Software by spring...");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ",  developer=" + developer + ", date=" + date + ", free=" + free + "]";
	}

}
