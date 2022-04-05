package com.java.assignment;

import java.util.Scanner;

abstract class Calculate
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter two numbers: ");
	}
	
	abstract void calculate();
	abstract void print();
}
class Sum extends Calculate
{
	void accept()
	{
		System.out.println("Enter value for a & b : ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	@Override
	void calculate() 
	{
		sum=a+b;
	}

	@Override
	void print() 
	{
		System.out.println("SUM= : "+sum);
	}
	
}
public class Abstraction_a {

	public static void main(String[] args) {
		Sum obj=new Sum();
		obj.accept();	//here accept method of Calculate class is overridden by the accept method of Sum class
		obj.calculate();
		obj.print();
	}

}
