package com.xwork.spring_template.soldier.boot;

import com.xwork.spring_template.soldier.dto.SoldierDTO;
import com.xwork.spring_template.soldier.service.SoldierService;
import com.xwork.spring_template.soldier.service.SoldierServiceImpl;

public class SoldierTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoldierDTO dto = new SoldierDTO("Rajuuu", 2, "Topper", "Xwork", "BAGALKOTE");

		SoldierService service = new SoldierServiceImpl();
		service.validateAndSave(dto);
	}

}
