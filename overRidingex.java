package com.si.sample;
class parent{
	
static void print() {
		System.out.println("iam static method in parent class");
	}

	void display() {
		System.out.println("iam instance method in parent class");
	}
}

class child extends parent{
	static void print() {
		System.out.println("iam static method in child class");
	}

	
	void display() {
	System.out.println("iam instance method in child class");
	}
}
class overRidingex {

	public static void main(String[] args) {
		parent c=new child();
	c.display();
	c.print();
	}

}
