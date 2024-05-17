package com.si.sample;

class  PolymorphismMOverRiding1{
	public void displayInfo() {
	    System.out.println("Common English Language");
	  }
}
class PolymorphismMOverRiding2 extends PolymorphismMOverRiding1 {
	
	@Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }

}
class PolymorphismMOverRiding{
	public static void main(String[] args) {
		PolymorphismMOverRiding1 obj1=new PolymorphismMOverRiding1();
		obj1.displayInfo();
		
		PolymorphismMOverRiding2 obj2=new PolymorphismMOverRiding2();
		obj2.displayInfo();
	}
}