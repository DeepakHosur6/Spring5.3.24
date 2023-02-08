package com.xworkz.deepakDay5.dto;

import lombok.Data;

@Data
public class FamilyDTO {
	
	private String fatherName;
	private String motherName;
	private String elderBrotherName;
	private String sisterName;
	private String sirName;
	private String cousinName;
	private Integer noOfMembers;
	private String fathersWork;
	private String myName;
	private String brotherName;

	public FamilyDTO() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}


}
