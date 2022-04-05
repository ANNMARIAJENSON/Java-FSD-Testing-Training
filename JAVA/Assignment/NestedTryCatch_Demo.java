package com.java.assignment;

import java.util.Scanner;

public class NestedTryCatch_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			try
			{
				System.out.println("DIVISION OF TWO NUMBERS ");
				System.out.println("Enter the first number : ");
				int first=sc.nextInt();
				System.out.println("Enter the second number : ");
				int second=sc.nextInt();
				double result=first/second;
				System.out.println("The result is : "+result);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero is not possible !"+"\n"+"Arithmetic Exception Caught");
			}
		}
		catch(Exception e)
		{
			System.out.println("Outer Catch");
		}
		finally
		{
			System.out.println("Finally ,the operation is executed!");
		}
		System.out.println("\n"+"*****************END**********************");
	}

}
