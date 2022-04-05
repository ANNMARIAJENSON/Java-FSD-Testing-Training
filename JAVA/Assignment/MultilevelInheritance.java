package com.java.assignment;
class Transport
{
	void type()
	{
		System.out.println("Transports can be of different type");
	}
}
class Air extends Transport
{
	void air()
	{
		System.out.println("Air can be a medium for transportation");
	}
}
class Plane extends Air
{
	void plane()
	{
		System.out.println("Aeroplane is a type of air transport");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Plane obj=new Plane();
		obj.type();
		obj.air();
		obj.plane();
	}

}
