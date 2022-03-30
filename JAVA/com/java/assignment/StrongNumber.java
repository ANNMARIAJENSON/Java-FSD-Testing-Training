package com.java.assignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		//strong number=sum of factorial of digits is the number itself
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check :");
		int num=sc.nextInt();
		int fact,remainder,sum=0,i,temp;
		temp=num;
		while(temp>0) 
		{
			fact=1;
			remainder=temp%10;
			for(i=1;i<=remainder;i++)
			{
				fact=fact*i;
			}
			System.out.println(" The Factorial of " + remainder + "  =  " + fact);
		    sum = sum + fact;
		    temp=temp/10;
		}		
		System.out.println(" The Sum of the Factorials of a Given Number " + num + " =  " + sum);
		if ( num == sum )
		{
			System.out.println("\n " + num + " is a Strong Number");
		}
		else
		{
		   System.out.println("\n " + num + " is Not a Strong Number");
		}
	}
}