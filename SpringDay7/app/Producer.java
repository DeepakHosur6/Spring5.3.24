package com.xworkz.SpringDay7.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant ass;
	@Autowired
	private Company com;

	public Producer() {
		System.out.println("Producer constructor created");
	}

}
