package Day11;

class UserDefinedException1 extends Exception
{
	public UserDefinedException1(String str)
	{
		super(str);
	}
}
class UserDefinedException
{
	public static void main(String[] args)
	{


			try
			{
				throw new UserDefinedException1("Just an Example");
			}	
			catch(UserDefinedException1 e)
			{
				System.out.println("Caught the User-defined exception");
				System.out.println(e);
			}
			System.out.println("rest of the code");
	}

}