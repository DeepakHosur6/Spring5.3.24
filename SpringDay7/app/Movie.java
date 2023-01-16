package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired
	private Director dr;
	@Autowired
	private Producer pr;
	@Autowired
	private CameraMan cams;

	public Movie() {
		System.out.println("Movie is Constructor is created");
	}

}
