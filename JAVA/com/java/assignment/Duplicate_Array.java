package com.java.assignment;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int i,j;
		int[] arr=new int[size];
		int[] dup=new int[size];
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
		System.out.println("Duplicate elements in the array are: ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

}
