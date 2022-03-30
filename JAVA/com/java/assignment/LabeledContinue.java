package com.java.assignment;

import java.util.Scanner;

public class LabeledContinue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 25 : ");
		int n=sc.nextInt();
	outer:
		for(int i=1;i<=25;i++)
		{
			if(i==n)	
			{
				continue outer;
			}
			System.out.print(" "+i);
		}
}
}