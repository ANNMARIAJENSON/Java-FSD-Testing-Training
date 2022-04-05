package com.java.assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		//palindrome number=same number after reverse also
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check :");
		int num=sc.nextInt();
		int temp,r,sum=0;
		temp=num;    
		  while(num>0)
		  {    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("The entered number is a palindrome number ");    
		  else    
		   System.out.println("The entered number is not a palindrome number");    
	}

}
