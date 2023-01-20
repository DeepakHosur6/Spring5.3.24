package com.xwork.spring_template.soldier.service;

import com.xwork.spring_template.soldier.dto.FirstAidDTO;

public interface FirstAidService {

	boolean validateAndSave(FirstAidDTO aidDTO);
}
