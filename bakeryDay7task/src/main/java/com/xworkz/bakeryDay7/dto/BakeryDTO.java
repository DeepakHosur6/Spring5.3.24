package com.xworkz.bakeryDay7.dto;

import lombok.Data;

@Data
public class BakeryDTO {

	private String name;
	private String owner;
	private String wife;
	private boolean married;
	private String famous;
	private String since;

	BakeryDTO() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}
}
