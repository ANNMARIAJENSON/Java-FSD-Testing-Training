package com.java.assignment;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int small=(a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println("Smallest of three numbers is : "+small);
		sc.close();
	}

}
