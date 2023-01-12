package com.xworkz.SpringDay5.tester5;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringDay5.app5.Hardware;
import com.xworkz.SpringDay5.app5.Pencil;
import com.xworkz.SpringDay5.app5.PersonalInfo;
import com.xworkz.SpringDay5.app5.Rubber;
import com.xworkz.SpringDay5.app5.Software;
import com.xworkz.SpringDay5.app5.SoftwareEngineerCs;
import com.xworkz.SpringDay5.configuration5.Configuration5;

public class Tester5 {
	
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(Configuration5.class);
		System.out.println("===================================");
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		System.out.println("===================================");
		
		/*
		 * FirstTime ref1 = spring.getBean(FirstTime.class); System.out.println(ref1);
		 * 
		 * Government ref2 = spring.getBean(Government.class); System.out.println(ref2);
		 */
		
		Hardware ref3 = spring.getBean(Hardware.class);
		System.out.println(ref3);
		System.out.println("===================================");
		
		Software ref4 = spring.getBean(Software.class);
		System.out.println(ref4);
		System.out.println("===================================");
		
		Pencil ref5 = spring.getBean(Pencil.class);
		System.out.println(ref5);
		
		Rubber ref6 = spring.getBean(Rubber.class);
		System.out.println(ref6);
		System.out.println("===================================");
		
		SoftwareEngineerCs ref7 = spring.getBean(SoftwareEngineerCs.class);
		System.out.println(ref7);
		System.out.println("===================================");
		
		PersonalInfo ref8 = spring.getBean(PersonalInfo.class);
		System.out.println(ref8);
	}

}
