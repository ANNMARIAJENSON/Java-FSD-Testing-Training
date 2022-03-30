package Day16_Assignment;

import java.util.Scanner;

//implementation of insertion sort
public class Qtn2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
		//sorting of array elements using insertion sort
		for (int i = 1; i < n; ++i) 
		{
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
       //-----------------------------for traversing----------------------------
          /* for (int k=0; k<n; ++k)
			{
				System.out.print(arr[k]+",");
			}
				System.out.println("");	*/
      //-------------------------------------------------------------------------
        }
		System.out.println("The sorted array is : ");
		for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    
    }
	}


