package Day1;

import java.util.Scanner;

public class MultiplyDivide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,res;
		System.out.println("Enter three numbers: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		res=(a*b*c)/3;
		System.out.println("The result is : "+res);
	}

}
