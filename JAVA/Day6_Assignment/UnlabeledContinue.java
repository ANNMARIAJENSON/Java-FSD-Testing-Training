package com.java.assignment;

public class UnlabeledContinue {

	public static void main(String[] args) {
		System.out.println("Printing numbers less than 25 :");
		for(int i=1;i<25;i++)
		{
			if(i>25)
			{
				continue;
			}
			System.out.print(" "+i);
		}
	}
}