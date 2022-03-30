package Day4;

//multilevel inheritance
class Animal1
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
	System.out.println("Dog is barking");
	}
}
class Puppy extends Dog1{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		obj.weeping();
		obj.bark();
		obj.eat();
	}

}
