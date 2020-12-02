package com.cg.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
public class Sbu {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	@Value("#{empList}")
	private List<Employee> empList;
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public Sbu(int sbuId, String sbuName, String sbuHead) {
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void display() {
		System.out.println("SBu details are : ");
		System.out.print("SbuId : "+getSbuId());
		System.out.print(", SbuName : "+getSbuName());
		System.out.print(", SbuHead : "+getSbuHead());
		System.out.print(", SbuId : "+getSbuId());
		System.out.println();
		System.out.println("Employee details are:");
		System.out.println(getEmpList());
		
		}
	
		
	}

