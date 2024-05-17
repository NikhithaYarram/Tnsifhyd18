package com.si.sample;

class Car1 {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

}
public class DefaultConstructor {
	
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		System.out.println(c1.run());
	}
}