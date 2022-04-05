package com.java.assignment;

import java.util.Scanner;

public class UnlabeledBreak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,5,6,9,3,7,4};
		int i,flag=0;
		System.out.println("Enter a number to search in the given array : ");
		int search=sc.nextInt();
		for(i=0;i<=6;i++)
		{
		if(arr[i]==search)
		{
			flag=1;
			break;
		}
		else
		{
			flag=0;
		}
		}
		if(flag==1)
		{
		System.out.println("The searched element "+search+" is at :"+i);
		}
		else
		{
		System.out.println("Element not in array");
}
}
	}

