package Day18_Assignment;

import java.util.Scanner;

public class MergeSort {
	  public static void main(String args[]) {
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
	        
	        mSort(arr,0,arr.length-1);
	        System.out.println("The array after sorting is :");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
}

	private static void mSort(int[] arr, int i, int j) {
		if(i<j)	//i=starting index,j=last index
		{
			int mid=(i+j)/2;
			mSort(arr,0,mid);
			mSort(arr,mid+1,j);
			merge(arr,i,mid,j);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int [] arr1=new int[arr.length];
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid&&j<=high)
		{
			if(arr[i]<arr[j])
			{
				arr1[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				arr1[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			arr1[k]=arr[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			arr1[k]=arr[j];
			j++;
			k++;
		}
		
		for(i=low;i<=high;i++)
		{
			arr[i]=arr1[i];
		}
	}
}