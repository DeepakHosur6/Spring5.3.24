package com.xworkz.browserTask.beanBrowser;

import org.springframework.stereotype.Component;

@Component
public class Firefox implements Browser{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Inside Firefox implements class, Calling browser()");
		System.out.println("Running fire Box");
		
	}
	
	
	

}
