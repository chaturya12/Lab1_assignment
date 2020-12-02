package com.cg.anno;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String businessUnit;
	private int age;
	
	
	public Employee(int empId, String empName, int salary, String businessUnit, int age) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("employee details are:");
		System.out.println("Employee id : "+getEmpId());
		System.out.println("Employee name : "+getEmpName());
		System.out.println("Employee salary:"+getSalary());
		System.out.println("Employee BU : "+getBusinessUnit());
		System.out.println("Employee age : "+getAge());
	}

}
