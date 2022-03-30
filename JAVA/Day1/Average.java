package Day1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter three double values:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double avg=(a+b+c)/3;
		System.out.println("The average of three numbers is : "+avg);
	}
	

}
