package com.java.practise;

class Parent
{
	void show()
	{
	System.out.println("Inside parent class");
	}
}
class Child extends Parent
{
	void show()
	{
	System.out.println("Inside child class");
	}
}
public class InstanceOfOperator {

	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		System.out.println("p is a instance of Child : "+(p instanceof Child));
		System.out.println("p is a instance of Parent : "+(p instanceof Parent));
		System.out.println("c is a instance of Parent : "+(c instanceof Parent));
	}

}
