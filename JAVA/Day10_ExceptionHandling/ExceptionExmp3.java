package Day10_ExceptionHandling;

public class ExceptionExmp3 {
	public static void main(String[] args) {
		int sum=0;
		try
		{
			int[]arr1= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[15]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		for(int i=0;i<5;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first 5 elements : "+sum);
	}
}
