package Day2;

import java.util.Scanner;

public class IterationDoWhile {

	public static void main(String[] args) {
		//to print from 1-10
/*		int a=1;
		do
		{
			System.out.print(a+" ");
			a++;
		}
		while(a<=10);
		System.out.println("\n"+"Out of Do-While");
*/
//----------------------------------------------------------
		//prints from 10-1
/*		int a=10;
		do
		{
			System.out.print(a+" ");
			a--;
		}
		while(a>=1);	*/
		
//---------------------------------------------------------------
		//prints from 1 to n
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int limit=sc.nextInt();
		int a=1;
		do
		{
			System.out.print(a+" ");
			a++;
		}while(a<=limit);

//-------------------------------------------------------------------
		
	}

}
