package com.praveen.beans;

public class Student {
	private int rollNo;
	private String name;
	
	public Student() {
		System.out.println("Student 0-param constructor");
		}
	public Student(int rollNo, String name) {
		System.out.println("Student 2-param constructor");
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	

}



