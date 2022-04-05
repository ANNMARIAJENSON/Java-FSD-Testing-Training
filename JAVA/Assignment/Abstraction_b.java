package com.java.assignment;

interface interface1
{
	void method1();
	void method2();
}
public class Abstraction_b implements interface1 {
	@Override
	public void method1() 
	{
		System.out.println("Body of method 1");
	}

	@Override
	public void method2() 
	{
		System.out.println("Body of method 2");
	}
	
	void thismethod()
	{
		System.out.println("Body of this method");
	}
	
	public static void main(String[] args) {
		Abstraction_b obj=new Abstraction_b();
		obj.method1();
		obj.method2();
		obj.thismethod();
	}

}
