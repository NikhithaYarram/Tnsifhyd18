package com.Day2;
import java.util.*;
class Base{
	void Display() {
		System.out.println("Base class Display method");
		
	}
	static void Display1() {
		System.out.println("Base class Display1 method");
	}
}

class Derived extends Base{
	void Display() {
		System.out.println("Derived class Display method");
	}
	static void Display1() {
		System.out.println("Derived class Display1 method");
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		Base b=new Base();
		b.Display();
		Base.Display1();
		

	}

}
