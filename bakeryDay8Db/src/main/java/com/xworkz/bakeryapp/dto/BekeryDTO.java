package com.xworkz.bakeryapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bakery_table")
public class BekeryDTO {
	@Id
	private int id;
	@Column(name = "c_name")
	private String bekeryName;
	@Column(name = "c_owner")
	private String ownerName;
	@Column(name = "c_wife")
	private String ownerWifeName;
	@Column(name = "c_famous")
	private String famouaIn;
	@Column(name = "c_since")
	private String scine;

	private boolean married;

	public BekeryDTO() {

		System.out.println("Constructor is BekeryDTO Created in : " + this.getClass().getSimpleName());
	}

}
