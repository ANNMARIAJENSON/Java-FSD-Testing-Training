package Day7;

import java.util.Scanner;

public class TwoDArray2 {

	public static void main(String[] args) {
		int[][] arr1=new int[2][2];
		int[][] arr2=new int[2][2];
		int[][] arr3=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements for first array :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();			
			}
		}
	System.out.println("The array elements of first array are :");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println("\n");
	System.out.println("Enter the array elements for second array :");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			arr2[i][j]=sc.nextInt();			
		}
	}
	System.out.println("The array elements of second array are :");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println(" ");
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			arr3[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	System.out.println("\n");
	System.out.println("The sum of array elements are :");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr3[i][j]+" ");
		}
		System.out.println(" ");
	}
	}

}
