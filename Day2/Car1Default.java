package com.Day2;
class Car1Default implements Runnable{
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1Default() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	 public void run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			System.out.println("car is running");
		}
		else{
			System.out.println("car is not running");
		}
	}

}
