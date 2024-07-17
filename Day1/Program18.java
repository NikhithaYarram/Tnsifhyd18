package com.Day1;
import java.util.*;
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Enter the range:");
		int range=sc.nextInt();
		System.out.println("Multiplication Table for "+num+":");
		for(int i=1;i<=range;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
