package com.xworkz.browserTask.beanBrowser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {

	@Autowired
	@Qualifier("jio")
	private Provider provider;

	@Autowired
	@Qualifier("airtel")
	private Provider provider1;

	@Override
	public void browse() {
		System.out.println("");
		System.out.println("Inside Chrome implements class, Calling browser()");
		System.out.println(" Running chrome browser");

		provider.connect();
		provider1.connect();
	}

}
