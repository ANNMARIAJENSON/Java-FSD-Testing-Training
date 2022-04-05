package com.java.assignment;

import java.util.Scanner;

public class CharacterOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		System.out.println("Enter the element to be searched :");
		char c=sc.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c)
				count++;
		}
		System.out.println(" "+c+" appears "+count+" times");
	}

}
