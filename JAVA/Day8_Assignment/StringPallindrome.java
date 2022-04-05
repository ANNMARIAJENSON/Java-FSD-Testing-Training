package com.java.assignment;

import java.util.Scanner;

public class StringPallindrome {
	public static boolean check(String str)
	{
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt((len-i-1)))
					return false;
		}
		return true;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with multiple words : ");
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(StringPallindrome.check(arr[i]))
			{
				 System.out.println(arr[i]+"  is a palindrome");
			}
			else
			{
				System.out.println(arr[i]+"  is not a palindrome");
			}
		}
	}
}
