package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera cam;
	
	public CameraMan() {
		System.out.println("CameraMan constructor is Created.");
	}

}
