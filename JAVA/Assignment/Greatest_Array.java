package com.java.assignment;

import java.util.Scanner;

public class Greatest_Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int i,j,temp=0;
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
		System.out.println("Greatest element in the array is: ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(temp);
	}

}
