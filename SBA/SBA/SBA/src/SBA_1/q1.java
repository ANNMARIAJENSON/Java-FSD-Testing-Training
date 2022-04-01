/*1.Write a program to create a array list of double element and add the elements.
sort the elements in descending order and print it.*/

package SBA_1;

import java.util.ArrayList;
import java.util.Collections;

public class q1 {

	public static void main(String[] args) {
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(20.15);
		list.add(12.12);
		list.add(100.0);
		list.add(10.05);
		list.add(10.07);
		list.add(200.15);
		System.out.println("The arraylist before sorting is : ");
		for(double newlist:list)
		{
			System.out.println(newlist);
		}
		Collections.sort(list, Collections.reverseOrder()); 
		System.out.println("The arraylist after sorting is : ");
		for(double newlist:list)
		{
			System.out.println(newlist);
		}
		
	}
	}

