package com.cg.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.anno.Config;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("anno.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee employee=context.getBean(Employee.class);
		employee.display();
		
	}

}
