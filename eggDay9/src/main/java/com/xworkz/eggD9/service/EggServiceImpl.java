package com.xworkz.eggD9.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.eggD9.dto.EggDTO;
import com.xworkz.eggD9.repository.EggRepository;
@Service
public class EggServiceImpl implements EggService {
	
	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImpl() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("Running validateAndSave!!! ");
		boolean saved = this.eggRepository.save(dto);
		System.out.println("Saved in service : " + saved);
		return false;
	}

	
	

}
