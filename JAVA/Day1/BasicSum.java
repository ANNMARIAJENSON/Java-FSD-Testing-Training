package Day1;

import java.util.Scanner;

public class BasicSum {
	static String check="Checking global variable";	//global variable
	public static void check()
	{
		System.out.println(check);
	}

	public static void main(String[] args) {
		System.out.println("Checking global variable: ");
		check();
		//--------------------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("SUM");
		System.out.println("Enter the first number: ");
		double a=sc.nextDouble();
		System.out.println("Enter the second number: ");
		double b=sc.nextDouble();
		System.out.println("Enter the third number: ");
		double c=sc.nextDouble();
		double sum=a+b+c;
		System.out.println("The sum of three numbers is : "+ sum);
	}

}
