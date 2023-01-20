package com.xworkz.springDay9LambookQuarkus.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AbstractAuditDTO implements Serializable {

	
	private String updatedBy;
	private LocalDate updatedDate;
	
	private String createdBy;
	private LocalDate createdDate;
		
}