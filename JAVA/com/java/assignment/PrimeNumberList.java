package com.java.assignment;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int num=sc.nextInt();
		System.out.println("List of prime numbers from 1 to "+ num+" are :");
		for (i = 1; i <= num; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(j =i; j>=1; j--)
	         {
		    if(i%j==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    System.out.print(i+" ");
		 }	
	      }	
	}

}
