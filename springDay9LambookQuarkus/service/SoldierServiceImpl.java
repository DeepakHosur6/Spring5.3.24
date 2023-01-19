package com.xworkz.springDay9LambookQuarkus.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.xworkz.springDay9LambookQuarkus.dto.SoldierDTO;
import com.xworkz.springDay9LambookQuarkus.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService{

	private SoldierRepo soldierRepo;

	public void SoliderServiceImpl() {
		System.out.println("creating soldierServiceImpl");

	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	public boolean validateAndSave(SoldierDTO dto) {

		System.out.println("Executing validateAndSave start");
		System.out.println("Dto started" + dto);

		// service.validateAndSave(soldierDTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(a -> System.err.println(a.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		boolean saved = soldierRepo.save(dto);
		System.out.println(saved);
		return saved;
		}
	}

