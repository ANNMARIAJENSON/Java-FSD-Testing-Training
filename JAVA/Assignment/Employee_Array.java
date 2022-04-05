package com.java.assignment;
import java.util.Scanner;

public class Employee_Array {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many employees do you want to enter: ");
		int n=sc.nextInt();
		System.out.println("Enter employee Name, Salary, Doj(dd/mm/yyyy) :");
		String[] name=new String[n];
		double[] salary=new double[n];
		String[] doj=new String[n];
		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
			salary[i]=sc.nextDouble();
			doj[i]=sc.next();
		}
		System.out.println("\n");
		System.out.println("EMPLOYEE DETAILS ");
		System.out.println("------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee Name :"+name[i]+"\n"+"Employee Salary :"+salary[i]+"\n"+"Employee DOJ :"+doj[i]+"\n");
		}
	}

}
