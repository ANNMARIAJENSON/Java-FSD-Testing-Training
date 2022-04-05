package com.java.assignment;

import java.util.Scanner;

public class ExceptionHandling_B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		try
		{
			System.out.println("The entered string is : "+str);
			char pos=str.charAt(5);
			System.out.println("Character at the specified position is : "+pos);
			System.out.println("String index is valid");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
