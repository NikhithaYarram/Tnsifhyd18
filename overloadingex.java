
package com.si.sample;
class parent1{
	
 void add(int a, int b) {
		System.out.println(a+b);
	}

}

class child1 extends parent1{
	 void add(float a,float b) {
		System.out.println(a+b);
	}

}
public class overloadingex {

	public static void main(String[] args) {
            child1 c1=new child1();
            c1.add(56,78);
            c1.add(4.6f, 6.7f);

	}

}