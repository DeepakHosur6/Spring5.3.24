package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Autowired
	private Company com;

	public Assistant() {

		System.out.println("Assistant constructor is created ");
	}

}
