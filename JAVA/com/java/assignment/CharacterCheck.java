package com.java.assignment;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the first string : ");
		String s1=sc.nextLine();
		System.out.println("Enter the number of characters : ");
		int size =sc.nextInt();
		System.out.println("Enter the characters :");
		char[] a=new char[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		System.out.println("The entered characters are : ");
		for( i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			for(int j=0;j<size;j++)
			{
				if(a[j]==ch)
				{
					System.out.println(" Character "+a[j]+" is found in the string "+s1);
				}
			}
		}
	}

}
