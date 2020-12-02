package com.cg.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee emp=context.getBean(Employee.class);
		Sbu sbu=context.getBean(Sbu.class);
		System.out.println(emp.toString());
		//System.out.println(sbu.toString());

	}

}
