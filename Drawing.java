package com.spring.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	
	
	public static void main(String args[]){
		
//		BeanFactory  factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();

		//context.refresh();
		boolean result1 = context.containsBean("triangel1");
		System.out.println("This is the result  "+result1);
	
		InitDestroyMethods joe = (InitDestroyMethods)context.getBean("triangel1");
	    joe.draw();
	    
		//context.close();
	
	}

}
