package com.xworkz.deepakDay5.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.deepakDay5.dto.BeverageDTO;
import com.xworkz.deepakDay5.dto.ChartDTO;
import com.xworkz.deepakDay5.dto.EducationDTO;
import com.xworkz.deepakDay5.dto.FamilyDTO;
import com.xworkz.deepakDay5.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {

	@GetMapping("/user")
	public String onData(Model model) {

		System.out.println("Invoking onData method");
		// KeyData = key (String)
		model.addAttribute("KeyData", "userInformation"); // userInformation = value (any Object)
		return "Display.jsp"; // Request dispatch from Views

	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Invoking onEmail method : ");
		//model.addAttribute("height", "4.3");    or 
		//double refHeight =5.11;
		model.addAttribute("Gmail", "deepak@gmail.com");
		return "Display.jsp";
	}
	

	@GetMapping("/number")
	public String onMobile(Model model) {
		System.out.println("Invoking onMobile..");
		model.addAttribute("number", 9918461216L);
		return "Display.jsp";
	}

	@GetMapping("/aadhar")
	public String onAdhar(Model model) {
		System.out.println("Invoking onAdhar..");
		model.addAttribute("aadharNo", 906785245556L);
		return "Display.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Invoking onAge");
		model.addAttribute("age", 25);
		return "Display.jsp";
	}

	@GetMapping("/dob")
	public String onDate(Model model) {
		System.out.println("Invoking onDate....");
		model.addAttribute("dateAndTime", LocalDateTime.of (1998, 10, 31, 9, 30));
		return "Display.jsp";
	}

	@GetMapping("/amount")
	public String onSalary(Model model) {
		System.out.println("Invoking onSalary..");
		model.addAttribute("salary", 30600);
		return "Display.jsp";
	}

	@GetMapping("/friends")
	public String friendsName(Model model) {
		System.out.println("Invoking friendsName..");
		List<String> list = new ArrayList<String>();
		list.add("Tom");
		list.add("Alex");
		list.add("Mandy");
		list.add("Sandy");
		model.addAttribute("friend", list);
		return "Display.jsp";
	}

	@GetMapping("/places")
	public String visitedPlaces(Model model) {
		System.out.println("Invoking visitedPlaces...");
		List<String> list1 = new ArrayList<String>();
		list1.add("Kittur");
		list1.add("Belagavi");
		list1.add("Pune");
		list1.add("Murudeshwar");
		list1.add("Mysore");
		model.addAttribute("place", list1);
		return "Display.jsp";
	}

	@GetMapping("/skills")
	public String skillSets(Model model) {
		System.out.println("Invoking skillSets..");
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		list.add("BootStrap");
		list.add("JavaScript");
		list.add("MYSQl");
		model.addAttribute("skill", list);
		return "Display.jsp";
	}
	
	@GetMapping("/beverage")
	public String beverageDetails(Model model ) {
		System.out.println("Invoking beverageDetails method :");
		BeverageDTO dto = new BeverageDTO();
		dto.setName("Coffee");
		dto.setColor("Brown");
		dto.setBrand("Bru");
		dto.setFlavour("milk");
		dto.setPrice(30.00);
		dto.setBuyer("Sneha");
		dto.setQuantity("1 cup");
		dto.setShopName("Namm coffee");
		dto.setTypes(4);
		dto.setSugarContent("Less");
		model.addAttribute("coffee", dto);
		return"Display.jsp";	
	}
	
	@GetMapping("/charts")
	public String chatDetails(Model model) {
		System.out.println("Invoking chatDetails method :");
		ChartDTO dto = new ChartDTO();
		dto.setId(1);
		dto.setName("Gobi Manchuri");
		dto.setPrice(60.00);
		dto.setMadeBy("Pavan");
		dto.setLocation("Rajajinagar");
		dto.setQuantity("1 plate");
		dto.setCoolDrinkName("Sprite");
		dto.setBuyerName("Vineet");
		dto.setTaste(false);
		dto.setCenterName("Maruti Chat center");
		dto.setType("Spicy");
		model.addAttribute("chart", dto);
		return "Display.jsp";
	}
	
	@GetMapping("/edu")
	public String education(Model model) {
		EducationDTO dto = new EducationDTO();
		dto.setName("Deepak");
		dto.setLocation("Bailhongal");
		dto.setCollageName("RCUB");
		dto.setQualification("M.Sc");
		dto.setSemesters(4);
		dto.setPercentage(73.0);
		dto.setTotalMarks(3100);
		dto.setType("PG");
		dto.setAddress("Hosur");
		model.addAttribute("education", dto);
		return "Display.jsp";
	}
	
	@GetMapping("/fam")
	public String familyDetails(Model model) {
		FamilyDTO dto = new FamilyDTO() ;
		dto.setFatherName("Vittal");
		dto.setMotherName("Annapurna");
		dto.setElderBrotherName("Praveen");
		dto.setSisterName("Shivani");
		dto.setSirName("Hosur");
		dto.setCousinName("Shanker");
		dto.setBrotherName("Kiran");
		dto.setNoOfMembers(5);
		dto.setFathersWork("Teacher");
		dto.setMyName("Deepak");
		model.addAttribute("family", dto);
		return "Display.jsp";
	}
	
	@GetMapping("/mobile")
	public String mobileDetails(Model model) {
		System.out.println("running mobileDetails.");
		MobileDTO dto = new MobileDTO();
		dto.setBrand("MI");
		dto.setColor("GoldenPink");
		dto.setPrice(12000.00);
		dto.setVersion(6);
		dto.setStorage("64 GB");
		model.addAttribute("mob", dto);
		return "Display.jsp";
	}

}
