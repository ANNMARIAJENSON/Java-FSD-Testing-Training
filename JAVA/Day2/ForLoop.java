package Day2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//print from 1-10
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}	
//------------------------------------------------------------
		//print from 10-1
		System.out.println();
		for(int j=10;j>=1;j--)
		{
			System.out.print(j+" ");
		}	
//--------------------------------------------------------------
		//print from 1-n
		System.out.println();
		System.out.println("Enter a limit : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}	
//-----------------------------------------------------------------
		//print from n-1
		System.out.println();
		System.out.println("Enter a limit : ");
		int limit=sc.nextInt();
		for(int i=limit;i>=1;i--)
		{
			System.out.print(i+" ");
		}
//-----------------------------------------------------------------
	}

}
