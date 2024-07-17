package com.Day1;
import java.util.*;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem,n=0,orinum,res=0;
		orinum=num;
		while(orinum!=0) {
			orinum/=10;
			++n;
		}
		orinum=num;
		while(orinum!=0) {
			rem=orinum%10;
			res+=Math.pow(rem,n);
			orinum/=10;	
		}
		if(res==num) {
			System.out.println(num+" is a Armstrong");
		}
		else
			System.out.println(num+" is not a Armstrong");

	}

}
