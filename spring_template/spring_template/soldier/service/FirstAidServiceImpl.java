package com.xwork.spring_template.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xwork.spring_template.soldier.dto.FirstAidDTO;
import com.xwork.spring_template.soldier.repo.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;// propetry
	private FirstAidRepo firstAidRepo; // const

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("Created Service by passing repo.... From spring....");
		
	}

	public FirstAidServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
 
	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {

		System.out.println("running validate And Save");
		System.out.println("aidDTO : " + aidDTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(aidDTO);
		if (!violations.isEmpty()) {
			System.err.println("There are Validation Errors");
			violations.forEach(aid -> System.err.println(aid.getMessage()));
			return false;
		} else {
			System.out.println("Data is Valid...... + can Save ");
			boolean saved = this.firstAidRepo.save(aidDTO);
			System.out.println("Saved first aid " + saved);
			return saved;
		}

	}

}
