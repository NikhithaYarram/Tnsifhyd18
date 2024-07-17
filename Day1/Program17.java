package com.Day1;
import java.util.*;
public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		System.out.println("Numbet of digits in "+num +" is "+count);

	}

}
