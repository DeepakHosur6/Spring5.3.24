package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
public class ValentineController {

	@Autowired
	private ValentineService valentineService;
	
	private List<String> places = Arrays.asList("Cubbon Park", "BTM", "Lal Bagh", "MG Road", "Restaurant");
	private List<String> gifts = Arrays.asList("I-Phone", "Chocolate", "Ring", "Saree");

	public ValentineController() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onValentine(Model model) {
		System.out.println("Running onValentine Get Method :");

		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);

		System.err.println("Violation in Valentine Controller");
		return "valentine";
	}

	@PostMapping
	public String onValentine(Model model, ValentineDTO dto) {
		System.out.println("Running onValentine Post method " + dto);
		Set<ConstraintViolation<ValentineDTO>> violations = this.valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controler go to success page");
			return "ValentineSuccess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", violations);
		return "Valentine";
	}
}