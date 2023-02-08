package com.xworkz.deepakDay5.dto;

import lombok.Data;

@Data
public class MobileDTO {
	
	private String brand;
	private String color;
	private double price;
	private int version;
	private String storage;

	public MobileDTO() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

}
