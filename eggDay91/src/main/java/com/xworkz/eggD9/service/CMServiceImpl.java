package com.xworkz.eggD9.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import javax.xml.bind.Validator;

import org.springframework.stereotype.Service;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.eggD9.dto.CMDTO;

@Service
public class CMServiceImpl implements CMService {
	
	public CMServiceImpl() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		System.out.println("Running validateAndSave....");
		ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists, return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist, data is good.....");
			return Collections.emptySet();
		}
	
	}

}
