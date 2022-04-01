/*3. Write a program to implement Hashtable and add atleast 4 values into it,
implement the putIfAbsent() method.*/

package SBA_4;

import java.util.Hashtable;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hash table size: ");
	    int number = sc.nextInt();
	    int[] array = new int[number];
	    Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	    System.out.println("Enter your values : ");
	    for(int i = 0; i < array.length; i++)
	    {
	         
	        int value = sc.nextInt();  
	        String val=sc.next();
	        hm.put(value, val);	     }
	    	System.out.println("The original hash table is : "+hm);
	    	System.out.println("\n");
		   System.out.println("---------------remove method----------------");
		   System.out.println("Enter a value to remove : ");
		   int rem=sc.nextInt();
	       hm.remove(rem);  
	       System.out.println("After remove method: "+ hm);  
	       //updates the table
	       System.out.println("\n");
	       System.out.println("Initial table: "+hm);  
	       System.out.println("\n");
	       System.out.println("---------------putif method----------------");
	       System.out.println("Enter a value for putif method : ");
	       int p1=sc.nextInt();
	       String p2=sc.next();
	       hm.putIfAbsent(p1, p2);
	       System.out.println("Updated table: "+hm); 
	       System.out.println("\n");
	}
}