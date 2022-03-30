package Day17;

import java.util.Scanner;

class LinearSearch {  
public static int linearSearch(int a[], int n, int val) {   
  for (int i = 0; i < n; i++)  
    {  
        if (a[i] == val)  
        return i+1;  
    }  
  return -1;  
}  
public static void main(String args[]) {  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of array elements : ");
	int num=sc.nextInt();
    int[] arr = new int[num];
    System.out.println("Enter the array elements : ");
    for(int i=0;i<num;i++)
    {
    	arr[i]=sc.nextInt();
    }
    System.out.println("The array is : ");
    for(int i=0;i<num;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
    System.out.println("Enter the element to be searched in the array : "); 
    int val=sc.nextInt();  
    int res = linearSearch(arr, num, val);
  if (res == -1)  
  System.out.println("Element is not present in the array");  
  else  
  System.out.println("Element is present at " + res +" position of array");  
}  
}  