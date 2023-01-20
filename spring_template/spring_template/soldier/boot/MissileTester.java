package com.xwork.spring_template.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring_template.soldier.configuration.SpringConfiguration;
import com.xwork.spring_template.soldier.dto.MissileDTO;
import com.xwork.spring_template.soldier.service.MissileService;
 
public class MissileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service = container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());

	}

}
