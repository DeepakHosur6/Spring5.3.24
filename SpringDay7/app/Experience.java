package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill sk;
	public Experience() {
		System.out.println("Experience is constructor is created");
	}

}
