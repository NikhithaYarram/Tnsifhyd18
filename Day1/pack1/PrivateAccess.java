package com.Day1.pack1;
class A
{
private void display()
{
System.out.println("TNS Sessions");
}
}

public class PrivateAccess {

	public static void main(String[] args) {
		A obj = new A();
		//trying to access private method of another class
		//obj.display();	

	}

}
