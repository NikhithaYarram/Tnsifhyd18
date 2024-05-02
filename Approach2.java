package com.si.sample;
class Normal{
	String s="Hello";
	int a=45;
	static String b="sonu";
	void display() {
		System.out.println("brown");
	}
	static String display1() {
		return "blue";
	}
}

class Approach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Normal n=new Normal();
              System.out.println(n.a);
              Normal.display1();
              n.display();
              System.out.println(n.s);
              System.out.println(Normal.b);
              
	}
}
