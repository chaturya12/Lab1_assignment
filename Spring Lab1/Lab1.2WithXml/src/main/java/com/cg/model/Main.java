package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");		
		Employee employee=ctx.getBean(Employee.class);
		 
		SBu sbu=ctx.getBean(SBu.class);		
		employee.display();		
		


	}

}
