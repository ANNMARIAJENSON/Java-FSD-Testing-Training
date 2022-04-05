package Day5;

interface Shape
{
	void print();
}
class Rectangle implements Shape
{
	@Override
	public void print() {
			System.out.println("It is a rectangle");
	}
}

public class Interface {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.print();

	}
}

