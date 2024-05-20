package com.si.sample;

interface interfaceA{
	 abstract void display();
}

class print{
	void show() {
		System.out.println("Java can also be used as Frontend");
	}
}


public class MultipleInHeritance extends print implements interfaceA {
	
	public void display() {
		System.out.println("Java can be used as a Backend Language");
	}
    public static void main(String[] args) {
    	MultipleInHeritance obj=new MultipleInHeritance();
    	obj.display();
    	obj.show();
    }
}
