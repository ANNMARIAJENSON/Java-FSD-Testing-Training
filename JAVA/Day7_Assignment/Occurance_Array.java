package com.java.assignment;

import java.util.Scanner;

public class Occurance_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int i,j,count=0;
		int[] arr=new int[size];
		System.out.println("Enter the elements of the array :");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements of the array are :");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter a number in array to check its occurance :");
		int occur=sc.nextInt();
		System.out.println("Number of times "+occur+" occurs in the array :");
		for(i=0;i<size;i++)
		{
				if(arr[i]==occur)
				{
					count++;
				}
		}
		System.out.println(count);
	}


	}

