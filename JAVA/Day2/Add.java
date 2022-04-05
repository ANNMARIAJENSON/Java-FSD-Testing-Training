package Day2;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer and double value:");
		int a =sc.nextInt();
		double b=sc.nextDouble();
		double prod=a*b;
		System.out.println("The product is : "+prod);
	}

}
