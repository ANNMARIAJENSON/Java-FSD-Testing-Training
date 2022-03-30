package Day7;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		System.out.println("Enter the array values for first array : ");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("The array elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Enter the array values for second array : ");
		for(int i=0;i<size;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("The array elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		for(int i=0;i<size;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("\n");
		System.out.println("The sum of elements of array are : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr3[i]+" ");
		}


	}

}
