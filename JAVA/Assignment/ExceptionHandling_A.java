package com.java.assignment;

import java.util.Scanner;

public class ExceptionHandling_A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value1=null;
		try
		{
			System.out.println("INSIDE OUTER TRY BLOCK");
			try
			{
				if(value1.equals("Hello"))
					System.out.println("The values are same");
				else
					System.out.println("The values are not same");
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception Caught");
				System.out.println(e);
				System.out.println("\n");
			}
		try
		{
			
			System.out.println("Enter a value to check : ");
			String value=sc.next();
			Integer.parseInt(value);
			System.out.println("The entered value is an integer & it is  : "+value);
		}
		catch(NumberFormatException e)
		{
			System.out.println("You entered a value other than integer");
			System.out.println(e);
		}
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION OF OUTER TRY BLOCK");
		}
}
}