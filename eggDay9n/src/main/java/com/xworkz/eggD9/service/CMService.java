package com.xworkz.eggD9.service;

import java.util.Set;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}
