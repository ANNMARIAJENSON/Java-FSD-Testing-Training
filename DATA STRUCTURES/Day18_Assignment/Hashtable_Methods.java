package Day18_Assignment;

import java.util.*;

public class Hashtable_Methods {

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
/*		  hm.put(101,"Ann");  
		  hm.put(102,"Maria");  
		  hm.put(100,"Jenson");  
		  hm.put(103,"Rose");  
		  System.out.println("The current table is :"+hm);
		  System.out.println("\n");	*/
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
	       System.out.println("-----------object clone method---------------");
	       hm.clone();
	       System.out.println("Table after clone method : "+hm);
	       System.out.println("\n");
	       System.out.println("------------------hashcode method---------------");
	       int hashcode=hm.hashCode();
	       System.out.println("Hashcode of the table : "+hashcode);
	       System.out.println("\n");
	       System.out.println("------------clear method-------------------");
	       hm.clear();
	       System.out.println("Table after clear method : "+hm);
	}

}

