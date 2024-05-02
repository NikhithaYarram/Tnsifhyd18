package com.si.sample;

class Sample {
     String s1="Hi";
     static int b=10;
     void display() {
 		System.out.println("Brownie");
 	}
    static String disp() {
    	return "Hello";
    }
public static void main(String[] args) {
	String a="kashi"; 
	System.out.println(b);
	Sample s=new Sample();
	System.out.println(s.s1);
	System.out.println(a);
	System.out.println(disp());
	s.display();
	
}
}
