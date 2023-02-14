package com.xworkz.eggD9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggD9.dto.EggDTO;
import com.xworkz.eggD9.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	@Autowired
	private EggService eggService;
	
	public EggController() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onOrder ( EggDTO dto, Model mode)
	{
		System.out.println("Running onOrder () : "+ dto);
		boolean saved= this.eggService.validateAndSave(dto);
		System.out.println("Saved in Controller : "+saved);
		return "index";
	}
	
}
