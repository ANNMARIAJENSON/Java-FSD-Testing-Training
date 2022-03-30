package com.java.assignment;
//3 methods with same name but different type of arguments
public class MethodOverload2 {
	static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	static void add(String a,String b,String c)
	{
		System.out.println(a+b+c);
	}
	static void add(int a,double b,String c,long d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		System.out.println("Sum of two arguments : ");
		add(10,50.5);
		System.out.println("Sum of three string arguments : ");
		add("This","Is","Demo");
		System.out.println("Sum of four arguments : ");
		add(10,12.12,"Hi",91158);
		
	}

}
