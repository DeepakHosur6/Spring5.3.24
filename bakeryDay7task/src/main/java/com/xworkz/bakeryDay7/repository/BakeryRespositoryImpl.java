package com.xworkz.bakeryDay7.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakeryDay7.dto.BakeryDTO;
@Repository
public class BakeryRespositoryImpl implements BakeryRespository{
	
	public BakeryRespositoryImpl() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running save......");
		return false;
	}
	

}
