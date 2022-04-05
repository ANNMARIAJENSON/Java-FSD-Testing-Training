package Day4;
//-------------method overriding-----------------------
class Bike
{
	void run()
	{
		System.out.println("Runs at a speed");
	}
}
class Splendor extends Bike
{
	void run()
	{
		System.out.println("Runs more fast");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Bike obj=new Splendor();	//upcasting
		obj.run();
	}

}
