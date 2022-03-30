package Day12;
import java.util.*;
public class ArrayList_Example3 {
	public static void main(String args[]){

		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		for(String fruit:list)
		System.out.println(fruit);
	}
	
}