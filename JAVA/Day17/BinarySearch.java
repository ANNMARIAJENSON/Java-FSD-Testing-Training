package Day17;

import java.util.Scanner;

class BinarySearch{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = (first + last)/2;
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){
            return binarySearch(arr, first, mid-1, key);  
            }else{  
            return binarySearch(arr, mid+1, last, key);  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of array elements : ");
    	int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Enter the element to be searched in the array : ");  
        int key=sc.nextInt();
        int last=arr.length-1; 
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  