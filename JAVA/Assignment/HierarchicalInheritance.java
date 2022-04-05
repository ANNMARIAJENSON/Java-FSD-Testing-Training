package com.java.assignment;
class Fruits
{
	void fruits()
	{
		System.out.println("Fruits are of different type");
	}
}
class Mango extends Fruits
{
	void mango()
	{
		System.out.println("I fall under fruits category");
	}
}
class Melon extends Fruits
{
	void melon()
	{
		System.out.println("I also fall under fruits category");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Melon obj=new Melon();
		obj.fruits();
		obj.melon();
		//obj.mango();	//undefined type for melon class 
	}

}
