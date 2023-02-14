package com.xworkz.eggD9.controller;

import java.beans.ConstructorProperties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggD9.dto.CMDTO;
import com.xworkz.eggD9.service.CMService;

@Controller
@RequestMapping
public class CMController {

	@Autowired
	private CMService cmService;

	public CMController() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCM(CMDTO cmdto, Model model) {
		System.out.println("Running onCM " + cmdto);

		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(cmdto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation failed, display error messages");
		} else {
			System.out.println("Validation success, display success messages");
		}

		return "CM";
	}
}
