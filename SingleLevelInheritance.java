package com.si.sample;
class SingleLvlA{
public void display() {
		System.out.println("iam a method in class A");
	}
}
class SingleLvlB extends SingleLvlA{
	public void print() {
		System.out.println("iam a method in class B");
	}
}
class SingleLevelInheritance {
public static void main(String[] args) {
	SingleLvlB obj=new SingleLvlB();
	obj.display();
	obj.print();

}
}
