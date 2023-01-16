package com.xworkz.browserTask.testerBrowser;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.browserTask.beanBrowser.Chrome;
import com.xworkz.browserTask.beanBrowser.Firefox;
import com.xworkz.browserTask.configurationBrowser.ConfigurationBrowser;

public class TestBrowser {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationBrowser.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		System.out.println("Total bean is: "+container.getBeanDefinitionCount());

		
		Chrome chrome = container.getBean(Chrome.class);
		chrome.browse();
		
		Firefox fire = container.getBean(Firefox.class);
		fire.browse();
	}

}
