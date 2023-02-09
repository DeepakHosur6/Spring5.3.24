package com.xworkz.bakeryDay7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakeryDay7.dto.BakeryDTO;
import com.xworkz.bakeryDay7.repository.BakeryRespository;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRespository bakeryRepository;

	public BakeryServiceImpl() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running save in BakeryRespository  : " + dto);
		boolean saved = this.bakeryRepository.save(dto);
		System.out.println("Saved in repos " + saved);
		return false;
	}

}
