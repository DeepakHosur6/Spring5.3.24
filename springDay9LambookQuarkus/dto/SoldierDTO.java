package com.xworkz.springDay9LambookQuarkus.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO  extends AbstractAuditDTO{
	
	@NotBlank
	@NotNull
	@Size(min =3, max=20, message = "name should be greater than 3")
	private String name;
	@Min(value=0,message = "ID must be greater or equal to 1")
	private int id;
	@NotBlank
	@NotNull
	@Size(min =3, max=20)
	private String rank;
	@NotBlank
	@NotNull
	@Size(min =3, max=20)
	private String betalian;

}