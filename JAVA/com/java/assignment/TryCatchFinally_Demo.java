//demo of try-catch-finally//
package com.java.assignment;

import java.util.Scanner;

public class TryCatchFinally_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
			System.out.println("\n");
			System.out.println("Division by 0 is not possible");
			System.out.println("Arithmetic Exception Caught");
		}
		finally
		{
			System.out.println("\n");
			System.out.println("Finally,the operation has been executed !!");
		}
		System.out.println("********************END********************");
	}

}
