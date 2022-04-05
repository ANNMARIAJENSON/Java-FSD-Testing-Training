package com.java.assignment;

import java.util.Scanner;

public class String_CharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		char[] ch = s1.toCharArray();  
        int len = ch.length;  
        System.out.println("Character array elements are : ");  
        for (int i = 0; i < len; i++) 
        {  
            System.out.print(ch[i]+" ");  
        }  
        System.out.println("\n");
		System.out.println("The entered character array in reverse order :");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Reversed character array  :");
		for(int i = 0; i < len; i++)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Character array as string :");
		String string = new String(ch);  
		System.out.println(string);  
		
	}

}
