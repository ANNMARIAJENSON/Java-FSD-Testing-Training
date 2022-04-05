package com.java.assignment;
class Birds
{
	void fly()
	{
		System.out.println("Birds do fly");
	}
}
class Ostrich extends Birds
{
	void walk()
	{
		System.out.println("Ostriches cannot fly,they can only walk");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Ostrich os=new Ostrich();
		os.fly();
		os.walk();
	}

}
