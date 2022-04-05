package Day2;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
//demo of control flow statements
		Scanner sc=new Scanner(System.in);
/*		int a=20,b=10,c=20;
		if(a==b)
		{
			System.out.println("Inside the if loop");
		}
		else if(a==c)
		{
			System.out.println("Inside the else if loop");
		}
		else
		{
			System.out.println("Inside the else loop");
		}	*/
		
//demo of nested if
/*		int age,weight;
		System.out.println("Enter your age  :");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Enter your weight  :");
			weight=sc.nextInt();
			if(weight>=50)
			{
				System.out.println("The person is eligible to donate blood");
			}
			else
			{
				System.out.println("The person is under weight");
			}
		}
		else
		{
			System.out.println("The person is not eligible to donate blood");
		}	*/
		

//demo of switch statement
		int day;
		System.out.println("1.Sunday 2.Monday 3.Tuesday 4.Wednesday 5.Other");
		System.out.println("Enter a day :");
		day=sc.nextInt();
		int b=0;
		switch(day)
		{
			case 1:
				System.out.println("Sunday");
				System.out.println("Please select your slot");
				System.out.println("1.10am,2.11am,3.12pm");
				b=sc.nextInt();
				switch(b)
					{
						case 1:System.out.println("your appointment is booked for 10am ");
						   			break;
						 case 2:System.out.println("your appointment is booked for 11am ");
						   			break;
						 case 3:System.out.println("your appointment is booked for 12pm ");
						   			break;
						 default: System.out.println("Invalid input");
					}
				break;
			case 2:
				System.out.println("Monday");
				System.out.println("Please select your slot");
				System.out.println("1.10am,2.11am,3.12pm");
				b=sc.nextInt();
				switch(b)
					{
						case 1:System.out.println("your appointment is booked for 10am ");
						   			break;
						 case 2:System.out.println("your appointment is booked for 11am ");
						   			break;
						 case 3:System.out.println("your appointment is booked for 12pm ");
						   			break;
						 default: System.out.println("Invalid input");
					}
				break;
			case 3:
				System.out.println("Tuesday");
				System.out.println("Please select your slot");
				System.out.println("1.10am,2.11am,3.12pm");
				b=sc.nextInt();
				switch(b)
					{
						case 1:System.out.println("your appointment is booked for 10am ");
						   			break;
						 case 2:System.out.println("your appointment is booked for 11am ");
						   			break;
						 case 3:System.out.println("your appointment is booked for 12pm ");
						   			break;
						 default: System.out.println("Invalid input");
					}
				break;
			case 4:	
				System.out.println("Wednesday");
				System.out.println("Please select your slot");
				System.out.println("1.10am,2.11am,3.12pm");
				b=sc.nextInt();
				switch(b)
					{
						case 1:System.out.println("your appointment is booked for 10am ");
						   			break;
						 case 2:System.out.println("your appointment is booked for 11am ");
						   			break;
						 case 3:System.out.println("your appointment is booked for 12pm ");
						   			break;
						 default: System.out.println("Invalid input");
					}
				break;
			default:
				System.out.println("Other Days ");
				break;
		}
		
		
	}

}
