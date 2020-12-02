package com.cg.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Sbu sbu() {
		Sbu sbu=new Sbu(101,"Bu","kiran");
		return sbu;
		
	}
	@Bean
	public Employee employee() {
		Employee emp=new Employee(1,"kavya",25000,sbu(),24);
		return emp;
		
	}

}
