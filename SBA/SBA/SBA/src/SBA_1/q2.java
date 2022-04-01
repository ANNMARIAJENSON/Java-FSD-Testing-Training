//2.Create a array list of integers and find the sum and average of the entire list.

package SBA_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want :");
        int n = sc.nextInt(), sum = 0;
        double avg = 0;
        System.out.println("Enter " + n + " integer values :");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        {
            list.add(sc.nextInt());
        }
        System.out.println("\nOriginal arraylist : " + list);
        // finding sum
        for (int i : list) 
        {
            sum += i;
        }
        System.out.println("\nSum of all elements in the arraylist : " + sum);
        // finding average
        avg = (double) sum / list.size();
        System.out.println("\nAverage of all elements : " + avg);
	}
}

