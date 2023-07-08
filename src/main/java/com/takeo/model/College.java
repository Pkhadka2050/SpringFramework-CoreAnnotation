package com.takeo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	
	private String name;
	
	@Qualifier("sb1")     //to print more than one bean
	@Autowired
	private Student stu;

	public void setName(String name) {
		this.name = name;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public void displayDetails()
	{
		System.out.println("College Name: "+name);
		System.out.println("Student Info: ");
		System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
	}
	
	

}
