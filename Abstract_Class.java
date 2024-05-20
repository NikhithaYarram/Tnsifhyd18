package com.si.sample;
abstract class person{
	
	abstract void Eat();
	
	public void view() {
		System.out.println("Shares his/her thoughts");
	}
}

class Veg extends person{
	@Override
	void Eat() {
		System.out.println("Eats only Veg !");
	}
}

class Nonveg extends person{
	@Override
	void Eat() {
		System.out.println("Eats only Nonveg !");
	}
}
public class Abstract_Class {
	
  public static void main(String[] args) {
	person obj1=new Veg();
	obj1.view();
	obj1.Eat();
	System.out.println("------------------");
	Nonveg obj2=new Nonveg();
	obj2.Eat();
  }
}
