package com.xworkz.SpringDay6.tester6;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringDay6.app.Engine;
import com.xworkz.SpringDay6.app.NewsPaper;
import com.xworkz.SpringDay6.app.Snake;
import com.xworkz.SpringDay6.configuration6.Configuration6;

public class Tester6 {
	public static void main(String[] args) {

		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(Configuration6.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println("=========News Paper==========");
		NewsPaper ref=container.getBean(NewsPaper.class);

		System.out.println(ref);

		System.out.println("==========================================");
		System.out.println("=========Snake==========");
		Snake ref1 = container.getBean(Snake.class);
		System.out.println(ref1);
		System.out.println("==========================================");
		
		System.out.println("=========Engine==========");

		Engine ref2=container.getBean(Engine.class);

		System.out.println(ref2);
		
		System.out.println("==========================================");
		
		
		
		System.out.println("==========================================");
	}

}
