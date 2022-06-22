package com.zorba.test;

public class Student extends StudentDemo{

	
	public int classID;
	public String className;
	public String classAddress;
	
	public Student() {
		
	}
	
	public Student(String className,String classAddress) {
		
		this.className = className;
		this.classAddress = classAddress;
		
	}
	
	
	@Override
	public void addStd() {
		
	}
	@Override
	public void displayStd() {
		
		
		System.out.println("Student ID: 101"+" "+"Student Name: "+className+" "+"Student Address: "+classAddress);
		
	}
}
