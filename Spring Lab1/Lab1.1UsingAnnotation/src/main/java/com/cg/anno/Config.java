package com.cg.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Employee employee(){
		Employee employee=new Employee(1,"chatu",20000,"Bu",21);
		return employee;
		
		
	}

}
