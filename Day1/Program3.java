package com.Day1;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter a number to find factorial:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
			fact=fact*i;
		System.out.println("factorial of "+num+"is:"+fact);

	}

}
