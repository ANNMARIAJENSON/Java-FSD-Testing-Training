/*4.Write a program to check for the occurrence of a particular character in a
string and display how many times it has occurred.
note: take the String and the character to be checked as a input from the user.*/

package SBA_1;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		System.out.println("Enter the character to be searched :");
		char c=sc.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c)
				count++;
		}
		System.out.println(" "+c+" appears "+count+" times");
	}

}

