package Day2;

import java.util.Scanner;

public class Operators {
	//demo of operators in java

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("Enter two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//arithmetic operators
		c=a+b;
		System.out.println("The Result is : " +c);
		c=a-b;
		System.out.println("The Result is : " +c);
		c=a*b;
		System.out.println("The Result is : " +c);
		c=a/b;
		System.out.println("The Result is : " +c);
		c=a%b;
		System.out.println("The Result is : " +c);
		
		//compound assignment operators
		System.out.println("Enter two numbers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
			//x=x+y;
		System.out.println("The Result is : " +(x+=y));
		
		//relational operators
		System.out.println("Enter two numbers : ");
		int f=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("The Result is : " +(f==d));
		System.out.println("The Result is : " +(f>=d));
		
		//unary operator
		int z=1;
		z++;	//z=z+1
		System.out.println("Value of z: "+z);
		z--;	//z=z-1
		System.out.println("Value of z: "+z);
		
		
	}

}
