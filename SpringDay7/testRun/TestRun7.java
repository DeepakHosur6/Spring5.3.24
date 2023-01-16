package com.xworkz.SpringDay7.testRun;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.SpringDay7.app.Movie;
import com.xworkz.SpringDay7.configuration.Configuration7;

public class TestRun7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(Configuration7.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println("===================");
		System.out.println("Total bean is: "+container.getBeanDefinitionCount());

		Movie mov = container.getBean(Movie.class);
		System.out.println(mov);

	}

}
