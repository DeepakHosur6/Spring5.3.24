package com.xwork.spring_template.soldier.service;

import com.xwork.spring_template.soldier.dto.SoldierDTO;

public interface SoldierService {

	boolean validateAndSave(SoldierDTO dto);
}
