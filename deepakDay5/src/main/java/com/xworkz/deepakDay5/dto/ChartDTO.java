package com.xworkz.deepakDay5.dto;

import lombok.Data;

@Data
public class ChartDTO {

	private int id;
	private String name;
	private Double price;
	private String centerName;
	private String location;
	private String type;
	private String buyerName;
	private String madeBy;
	private String coolDrinkName;
	private String quantity;
	private boolean taste;

	public ChartDTO() {
		System.out.println("Constructor is Created : " + getClass().getSimpleName());
	}

}
