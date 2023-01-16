package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens len;
	@Autowired
	private Battery bat;
	
	public Camera() {
		System.out.println("Camera constructor is created.");
	}

}
