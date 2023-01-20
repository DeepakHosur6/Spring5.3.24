package com.xwork.spring_template.soldier.repo;

import com.xwork.spring_template.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	public SoldierRepoImpl() {
		System.out.println("Created SoldierRepoImpl using no-arg const.........");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save ");
		System.out.println("DTO " + dto);

		return false;
	} 

}
