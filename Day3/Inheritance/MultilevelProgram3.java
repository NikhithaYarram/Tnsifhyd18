package com.Day3.Inheritance;

public class MultilevelProgram3 extends MultilevelProgrammer2{
	
	int getLineofCode() {
		return 20;
	}
	
	public static void main(String[] args) {
		MultilevelProgram3 mp3 = new MultilevelProgram3();
		System.out.println("I am "+mp3.getName()+" and I code in " + mp3.getCodinglanguage()+".\nThis Program has " + mp3.getLineofCode()+" lines");
	}

}
