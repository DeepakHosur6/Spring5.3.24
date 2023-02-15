package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	
	@NotBlank(message = "Name Should Be filled, Cannot be blank")
	@Size(min = 3, max = 20, message = "Name Cannot less than 3 or Greator than 20")
	private String name;
	
	@NotBlank(message = "Valentine Name Should Be filled, Cannot be blank")
	@Size(min = 3, max = 20, message = "Valentine Name Cannot less than 3 or Greator than 20")
	private String valentineName;

	@NotBlank(message = "Place Should be Selected")
	private String place;

	@NotBlank(message = "Gift Should be Selected")
	private String gift;

}
