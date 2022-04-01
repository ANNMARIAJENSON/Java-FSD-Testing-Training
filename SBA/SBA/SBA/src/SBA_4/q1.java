/*1. Write a program to take an integer array from the user and give the user a
choice to sort using bubble sort (or) selection sort. Sort the array elements
according to the selected algorithm of the user and display the sorted
array.*/

package SBA_4;

import java.util.Scanner;

public class q1 {
	int i,j,n;
	void bubblesort(int arr[])
	{
		//sorting of array elements using bubble sort
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}		
				}
	}
	void printArray1(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void selectionsort(int arr[])
	{
		int n = arr.length; //6
		for (int i = 0; i < n-1; i++) 
		{
			int min_idx = i;//
			for (int j = i+1; j < n; j++) 
				{
					if (arr[min_idx] > arr[j])
					min_idx = j;//5
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp; 
		}
	}
	void printArray2(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		q1 obj=new q1();
		System.out.println("Enter the number of elements you want to enter into the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The entered array elements are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Enter your choice to sort the array- 1:Bubble Sort 2:Selection Sort");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("------------------------Array sorting using bubble sort------------------------");
			System.out.println("The sorted array is : ");
			obj.bubblesort(arr);
			obj.printArray1(arr);
			break;
		case 2:
			System.out.println("-----------------Array sorting using selection sort------------------");
			System.out.println("The sorted array is : ");
			obj.selectionsort(arr);
			obj.printArray2(arr);
			break;
		default:
			System.out.println("You entered an invalid option !");
			break;
		}
		
	}
}

