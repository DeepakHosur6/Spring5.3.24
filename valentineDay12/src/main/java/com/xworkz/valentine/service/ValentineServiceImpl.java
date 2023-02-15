package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepo;

@Service
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	private ValentineRepo repo;

	public ValentineServiceImpl() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("Set method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto, can Proced the save method");
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean save = this.repo.save(entity);
			System.out.println("Saved to Repository " + save);
			return Collections.emptySet();
		}
	}

}
