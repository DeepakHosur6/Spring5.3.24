package com.xworkz.crazy.component;

import org.springframework.stereotype.Component;

@Component
public class FiftyRupeeComponent {
	
	public FiftyRupeeComponent() {
		System.out.println("Created in : "+ this.getClass().getSimpleName());
	}

}
