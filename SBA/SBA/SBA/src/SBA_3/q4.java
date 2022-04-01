//4. Write a program to implement insertion sort.
package SBA_3;

import java.util.Scanner;

public class q4 {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];// 
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of array elements : ");
    	int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is : ");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println("\n");	
        
		q4 ob = new q4();
		System.out.println("The sorted array is : ");
		ob.sort(arr);

		printArray(arr);
	}
}
