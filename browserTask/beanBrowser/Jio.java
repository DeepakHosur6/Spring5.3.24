package com.xworkz.browserTask.beanBrowser;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Inside Jio implements class, Calling browser()");

		System.out.println("jio connector");
	}
}
