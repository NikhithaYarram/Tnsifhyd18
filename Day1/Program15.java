package com.Day1;
import java.util.*;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("sum of natural numbers "+sum);

	}

}
