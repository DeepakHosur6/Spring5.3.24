package com.xwork.spring_template.soldier.repo;

import com.xwork.spring_template.soldier.dto.SoldierDTO;

public interface SoldierRepo {

	boolean save(SoldierDTO dto);
	
}
