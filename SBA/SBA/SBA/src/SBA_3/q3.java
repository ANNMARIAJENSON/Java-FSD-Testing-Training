package SBA_3;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter stack size: ");
	    int number = sc.nextInt();
	    int[] array = new int[number];
	    Stack<Integer> stack = new Stack<Integer>();
	    System.out.println("Enter your numbers : ");
	    for(int i = 0; i < array.length; i++)
	    {
	         
	          int value = sc.nextInt();              
	          stack.push(value);
	     }
	    System.out.println("the original stack is : "+stack);
	    System.out.println("\n");
		//empty method
	    System.out.println("----------------Empty method--------------------------");
		boolean result = stack.empty();  
		System.out.println("Is the stack empty ? "+result); 
		System.out.println("\n");
		System.out.println("------------------Iterator method---------------");
		ListIterator<Integer> ltr=stack.listIterator(stack.size());
		System.out.println("Iteration from top to bottom : ");
		while(ltr.hasPrevious())
		{
			int avg=ltr.previous();
			System.out.println(avg);
		}
		System.out.println("\n");
		//peek method
		System.out.println("----------------Peek method--------------------------");
		System.out.println("The peek element of the stack is: " + stack.peek());
		System.out.println("\n");
		//pop method
		System.out.println("----------------Pop method--------------------------");
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Elements in stack after pop operation : " + stack); 
		System.out.println("\n");
		//size method
		System.out.println("----------------Size method--------------------------");
		int x=stack.size();  
		System.out.println("The size of stack is: "+x);
		System.out.println("\n");
		//search method
		System.out.println("----------------Search method--------------------------");
		System.out.println("Enter the element to be searched :");
		int find=sc.nextInt();
		int location = stack.search(find);
		if(location>0)
		{
		System.out.println("Location of searched element is : " + location);  	
		}
		else
		{
			System.out.println("Searched element is not found");  
		}
		
		
	}

}
