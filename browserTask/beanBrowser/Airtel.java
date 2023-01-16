package com.xworkz.browserTask.beanBrowser;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Inside Aitel implements class, Calling browser()");
		System.out.println("airtel connector");
	}

}