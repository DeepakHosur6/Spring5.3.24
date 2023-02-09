package com.xworkz.bakeryDay7.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakeryDay7.dto.BakeryDTO;
import com.xworkz.bakeryDay7.service.BakeryService;

@Controller    // @Component both can be used
@RequestMapping("/bakery")
public class BakeryController {
	
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("Constructor is Created in : " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onBakery (BakeryDTO bakeryDTO, Model model ) {
		System.out.println("Running onBakery  "+ bakeryDTO);
		model.addAttribute("name", bakeryDTO.getName());
		model.addAttribute("owner", bakeryDTO.getOwner());
		model.addAttribute("wife", bakeryDTO.getWife());
		model.addAttribute("married", bakeryDTO.isMarried());
		model.addAttribute("famous", bakeryDTO.getFamous());
		model.addAttribute("since", bakeryDTO.getSince());
		
		return "DisplaySuccess ";
	}
	
}
