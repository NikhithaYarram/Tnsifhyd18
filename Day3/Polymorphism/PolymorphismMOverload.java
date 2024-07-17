package com.Day3.Polymorphism;

public class PolymorphismMOverload {
	
	// method without parameter
	  public void display() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(":) ");
	    }
	  }

	  // method with single parameter
	  public void display(String symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }

}
