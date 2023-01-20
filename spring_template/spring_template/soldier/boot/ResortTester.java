package com.xwork.spring_template.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring_template.soldier.configuration.SpringConfiguration;
import com.xwork.spring_template.soldier.dto.ResortDTO;
import com.xwork.spring_template.soldier.service.ResortService;

public class ResortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());

	}

}
