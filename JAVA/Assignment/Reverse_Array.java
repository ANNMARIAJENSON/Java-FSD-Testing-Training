package com.java.assignment;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the string array :");
		int size=sc.nextInt();
		int i,j;
		String[] arr=new String[size];
		System.out.println("Enter the elements of the string array :");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("The elements of the string array are :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println("The entered array in reverse order :");
		for(i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
