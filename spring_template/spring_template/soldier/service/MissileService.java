package com.xwork.spring_template.soldier.service;

import com.xwork.spring_template.soldier.dto.MissileDTO;

public interface MissileService {
	
	boolean validateAndSave(MissileDTO msldto);

}
