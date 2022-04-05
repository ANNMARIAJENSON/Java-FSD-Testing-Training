package com.java.assignment;

class Dog
{
	 void breed()
	{
		System.out.println("There are different breeds of dog");
	}
}
 class Bulldog extends Dog
 {
	  void breed()
	 {
		 System.out.println("American Bulldog is a variant");
	 }
 }
 class Terrier extends Dog
 {
	 void breed()
	 {
		 System.out.println("Australian Terrier is a variant");
	 }
 }
public class RunTimePolymorphism {

	public static void main(String[] args) {
		Dog d=null;
		d=new Dog();
		d.breed();
		d=new Bulldog();
		d.breed();
		d=new Terrier();
		d.breed();
	}

}
