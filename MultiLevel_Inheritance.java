package com.si.sample;

class MultilevelPerson1 {
	
	String getName() {
		return "programmer";
	}
}

class MultilevelProgrammer2 extends MultilevelPerson1{
	
	String getCodinglanguage() {
		return "Java";
	}
}

class MultilevelProgram3 extends MultilevelProgrammer2{
	
	int getLineofCode() {
		return 32;
	}
}



class MultiLevel_Inheritance {
	public static void main(String[] args) {
		MultilevelProgram3 mp3 = new MultilevelProgram3();
		System.out.println("I am "+mp3.getName()+"\n"+"I code in " + mp3.getCodinglanguage()+"\n"+"This Program has " + mp3.getLineofCode()+" lines");
	}

}
