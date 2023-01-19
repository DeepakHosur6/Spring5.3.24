package com.xworkz.springDay9LambookQuarkus.repo;

import com.xworkz.springDay9LambookQuarkus.dto.SoldierDTO;

public interface SoldierRepo {
	
   boolean save(SoldierDTO dto);

}
