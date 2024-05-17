package com.si.sample;

class Car2 {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
 
	//Parameterised constructor
	public Car2(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}

}
public class ParameterisedConstructor {
	
	public static void main(String[] args) {
		Car2 c2 = new Car2("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}

}