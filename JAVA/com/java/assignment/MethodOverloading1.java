package com.java.assignment;
//3 methods with same name different number of arguments
public class MethodOverloading1 {
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	static void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
public static void main(String[] args)
{
	System.out.println("Sum of two arguments : ");
	add(10,20);
	System.out.println("Sum of three arguments : ");
	add(30,40,50);
	System.out.println("Sum of four arguments : ");
	add(10,50,80,20);
	
}
}
