package com.Day1;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		System.out.println("reversed number is "+rev);

	}

}
