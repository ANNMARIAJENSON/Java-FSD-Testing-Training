package Day5;
abstract class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
	abstract void display();
}
class Suzuki extends Bike
{
	void run()
	{
		System.out.println("Suzuki run");
	}

	void display() 
	{
		System.out.println("Suzuki display");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Bike obj=new Suzuki();
		obj.run();
		obj.display();
	}

}
