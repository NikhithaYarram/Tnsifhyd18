package com.Day2;

class Base1{
	void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
}
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b1=new Base1();
		b1.add(5, 5);
		b1.add(2, 3, 4);

	}

}
