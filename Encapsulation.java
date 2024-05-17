package com.si.sample;

public class Encapsulation {
	
	private String name="john";
	private int age=25;
	private String gender="Male";
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		
		System.out.println(e.getAge());
		System.out.println(e.getName());
		System.out.println(e.getGender());
	
	}

}