package com.si.sample;
class pattern{
	// method without parameter
	  public void show1() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void show1(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }
}
class PolymorphismOverLoading {
	public static void main(String[] args) {
		pattern obj1=new pattern();
		obj1.show1();
		System.out.println();
		obj1.show1('$');
	}

}
