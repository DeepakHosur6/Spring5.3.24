package com.xworkz.deepakDay5.dto;

import lombok.Data;

@Data
public class EducationDTO {

	private String name;
	private String location;
	private String collageName;
	private String qualification;
	private Integer semesters;
	private Double percentage;
	private Integer totalMarks;
	private String type;
	private String address;
	private String principleName;

	public EducationDTO() {
		System.out.println("Constructor is Created in : " + getClass().getSimpleName());
	}

}
