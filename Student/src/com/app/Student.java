package com.app;

public class Student {

	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[])
	{
	    System.out.println("main mathod");
	}
	
	public void m1()
	{
		System.out.println("This is m1 method");
	}

}
