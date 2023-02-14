package com.xworkz.eggD9.dto;

import javax.persistence.Entity;

import lombok.Data;

@Data

public class CMDTO {
	@NotNull(message = "CM Name can not be Null or Blank")
	@Size(min = 3, max = 20, message = "CM Name should be more than 3 and less than 20")
	private String name;
	@NotBlank(message = "Party can not be null")
	private String party;
	@NotBlank(message = "State can not be null")
	private String state;
	@NotNull(message = "Tenure can not be null")
	@Min(value = 1, message = "Tenure Can't be less than zero...")
	private Integer tenure;
	@NotBlank(message = "PortFolio can not be null")
	private String portfolio;

}
