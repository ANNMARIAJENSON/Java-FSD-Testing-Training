package com.java.assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3,i;
		System.out.println("Enter a limit upto which the series must be printed : ");
		int num=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(i=2;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
