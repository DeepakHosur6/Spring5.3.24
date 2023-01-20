package com.xwork.spring_template.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring_template.soldier.configuration.SpringConfiguration;
import com.xwork.spring_template.soldier.dto.FirstAidDTO;
import com.xwork.spring_template.soldier.service.FirstAidService;

public class FirstAidTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());

	}

}
