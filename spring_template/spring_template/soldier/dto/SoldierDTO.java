package com.xwork.spring_template.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class SoldierDTO extends AbstractAuditDTO {

	@NotNull // any non primitive
	@NotBlank // String
	@Size(min = 3, max = 20, message = "Name must be > 3 and 20 < ")
	private String name;
	@Min(value = 0)
	@Max(value = 2000, message = "Id must be geater than zero ")
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 40, message = "Rank must be > 5 and 40 < ")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 2, max = 30, message = "Batallion must be > 2 and 30 <")
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30, message = "Country must be > 1 and 30 <")
	private String country;

}
