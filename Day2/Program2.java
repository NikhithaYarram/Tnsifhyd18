package com.Day2;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=5+2;
		int b=5-2;
		int c=10/2;
		System.out.println("Arithmetic Operators:");
		System.out.println("Addition of 5,2 is"+a);
		System.out.println("subtraction of 5,2 is"+b);
		System.out.println("Division of 5,2 is"+b);
		System.out.println("Assignment Operators:");
		System.out.println(c+=a);
		System.out.println("Relational operators:");
		Boolean x=a>b;
		System.out.println(x);
		System.out.println("Ternary operator:");
		String y=(5>3)?"true":"false";
		System.out.println(y);
		System.out.println("Increment/Decrement operators:");
		System.out.println("a = "+a++);
		System.out.println("b = "+b--);
		
	}

}
