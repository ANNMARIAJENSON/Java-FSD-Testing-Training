package Day4;
class Shape
{
	void draw()
	{
		System.out.println("Any shape can be drawn");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle can be drawn");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle can be drawn");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle can be drawn");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		Shape obj=new Shape();
		obj.draw();	//method of shape class
		Shape obj1=new Rectangle();
		obj1.draw();//rectangle class method is overridden
/*		Shape s=null;	another method of creating object ---------upcasting
		s=new Shape();
		s.draw();
		s=new Circle();
		s.draw();
*/
	}

}
