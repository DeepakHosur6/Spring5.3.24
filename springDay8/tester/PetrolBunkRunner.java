package com.xworkz.springDay8.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springDay8.bean.PetrolBunk;
import com.xworkz.springDay8.configuration.Configuration8;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Configuration8.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println("===================");
		
		
		PetrolBunk refOfBunk = container.getBean(PetrolBunk.class);
		refOfBunk.purchase();
		
	}

}
