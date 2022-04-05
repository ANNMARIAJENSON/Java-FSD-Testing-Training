//package Day10_ExceptionHandling;

public class ExceptionExmp2 {

	public static void main(String[] args) {
		int a=3,b=2,c=5,avg;
		try
		{
			avg=(a+b+c)/0;
			System.out.println("Example");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//System.out.println((a+b+c)/3);
		}
		System.out.println("The End");
	}

}
