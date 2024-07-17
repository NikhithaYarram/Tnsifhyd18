package com.Day1;
import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		boolean isleapyear=(year%4==0&&year%100!=0)||(year%400==0);
		if(isleapyear)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
				
		

	}

}
