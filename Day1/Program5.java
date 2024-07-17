package com.Day1;
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number upto which fibanacci series to print");
		num=sc.nextInt();
		int a=0,b=1,c;

		for(int i=1;i<=num;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
