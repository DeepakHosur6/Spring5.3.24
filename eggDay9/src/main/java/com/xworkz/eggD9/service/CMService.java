package com.xworkz.eggD9.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.eggD9.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}
