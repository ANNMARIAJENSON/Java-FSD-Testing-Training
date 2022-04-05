package Day12;
import java.util.*;
public class ArrayList_Example4 {
	public static void main(String args[]){

		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		System.out.println("Entered List : "+al);
		System.out.println("Returning element: "+al.get(1));
		System.out.println("Modified list :");
		al.set(1,"Dates");
		for(String fruit:al)
		System.out.println(fruit);
		}
	}
