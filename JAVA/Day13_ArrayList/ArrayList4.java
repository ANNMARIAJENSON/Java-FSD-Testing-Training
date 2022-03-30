package Day13_ArrayList;

import java.util.*;
class ArrayList4
{
	public static void main(String[] args)
	{
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		System.out.println("The entered list is : "+sample);
		System.out.println("Modified with get method : "+sample.get(3));
		sample.set(2,"Renault");
		System.out.println("Modified with set method : "+sample);
		for(String car:sample)
		{
			System.out.println(car);
		}
	}
}