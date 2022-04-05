package Day2;

import java.util.Scanner;

public class IterationStatements {

	public static void main(String[] args) {
		//demo of while loop
		//to print from 1-10
/*		int a=10;
		while(a<=1)
		{
			System.out.print("  "+a);
			a++;
		}	*/
		
//-------------------------------------------------
		//to print from 10-1
/*		int a=10;
		while(a>=1)
		{
			System.out.print("  "+a);
			a--;
		}	*/
		
//---------------------------------------------------------
		//to print from 1-user limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int limit=sc.nextInt();
		int a=1;
		while(a<=limit)
		{
			System.out.print(" "+a);
			a++;
		}
		
//----------------------------------------------------------------
		
		
	}

}
 