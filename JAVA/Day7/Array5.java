package Day7;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter the  string array values : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		System.out.println("The string array elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
