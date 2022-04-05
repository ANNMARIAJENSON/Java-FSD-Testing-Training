package Day4;
//--------------Single Inheritance-----------------------------
class Animal
{
	void eat()
	{
		System.out.println("Animals do eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dogs bark");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
	}

}
