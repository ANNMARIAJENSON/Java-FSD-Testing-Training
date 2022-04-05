package Day18;

import java.util.Scanner;

public class InsertionSort {
		/*Function to sort array using insertion sort*/
		void sort(int arr[])
		{
			int n = arr.length;//5, 6, 11, 12, 13 n=5
			for (int i = 1; i < n; ++i) {
				int key = arr[i];//key=6 ,i=5
				int j = i - 1;//j=4-1=3

				/* Move elements of arr[0..i-1], that are
				greater than key, to one position ahead
				of their current position */
				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];// 
					j = j - 1;//j=1-1=0
				}
				arr[j + 1] = key;//0+1=0 , arr[1]=key(6)
			}
		}

		/* A utility function to print array of size n*/
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		// Driver method
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
	        
			InsertionSort ob = new InsertionSort();
			System.out.println("The sorted array is : ");
			ob.sort(arr);

			printArray(arr);
		}
}