package com.Day1;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");

	}

}
