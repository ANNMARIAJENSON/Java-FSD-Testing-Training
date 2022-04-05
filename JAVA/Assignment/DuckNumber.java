package com.java.assignment;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		//duck number=positive number that has zeroes in it
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check :");
		int num=sc.nextInt();
		boolean flag=false;
		int r;
		while(num>0)
		{
			r=num%10;	//finds last digit
			if(r==0)
			{
				flag=true;
			}
			num=num/10;	//moves to next digit
		}
	if(flag)
	{
		System.out.println("The entered number is a duck number");
	}
	else
	{
		System.out.println("The entered number is not a duck number");
	}

}
}