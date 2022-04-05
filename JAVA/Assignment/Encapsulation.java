package com.java.assignment;

import java.util.Scanner;

class Employee
{
	private String name;
	private String company;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		String str1,str2=null;
		System.out.println("Enter employee name : ");
		str1=sc.next();
		emp.setName(str1);
		System.out.println("Enter employee company : ");
		str2=sc.next();
		emp.setCompany(str2);
		System.out.println("EMPLOYEE DETAILS  :  "+"\n"+str1+"\n"+str2);
		
	}

}
