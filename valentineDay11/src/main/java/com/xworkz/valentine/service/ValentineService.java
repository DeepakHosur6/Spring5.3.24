package com.xworkz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;

@Service
public interface ValentineService {
	
Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);
}
