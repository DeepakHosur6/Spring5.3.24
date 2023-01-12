package com.xworkz.SpringDay5.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardware {
	
	@Autowired
	@Qualifier("idValue")
	private int id;
	@Autowired
	@Qualifier("nameOfHardware")
	private String name;
	@Autowired
	@Qualifier("number")
	private double gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("addresss")
	private String address;
	
	public Hardware() {
		System.out.println("Creating Hardware by spring...");
	}

	@Override
	public String toString() {
		return "Hardware [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName + ", address="
				+ address + "]";
	}

}
