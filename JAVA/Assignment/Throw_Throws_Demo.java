package com.java.assignment;

import java.util.Scanner;

public class Throw_Throws_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		check(age);
	}
	
	public static void check(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("\n"+"You are not eligible to vote !");
		}
		else
		{
			System.out.println("You are eligible to vote !");
		}
	}

}
