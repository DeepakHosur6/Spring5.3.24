package com.xwork.spring_template.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xwork.spring_template.soldier.dto.SoldierDTO;
import com.xwork.spring_template.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;
 
	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no-arg Const.......");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		System.out.println("Starting ValidateAndSave");
		System.out.println("DTO Passed " + dto);

		// Factory
		// valid
		// validate

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);

		if (!violations.isEmpty()) {
			System.err.println("There is validation errors");
			violations.forEach(v -> {
				System.err.println("Voilating message " + v.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is valid...");
			return true;
		}
	}

}
