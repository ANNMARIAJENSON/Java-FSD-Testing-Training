/*5.Write a program to take an input of a string with multiple words and convert it
into a string array,
and check if every element of that array is a Palindrome.
Note: Palindrome is a word which when reversed also is the same.*/

package SBA_1;

import java.util.Scanner;

public class q5 {
	public static boolean check(String str)
	{
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt((len-i-1)))
					return false;
		}
		return true;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string with multiple words : ");
		String str=sc.nextLine();
		char[] ch = str.toCharArray();  
        int len = ch.length;  
        System.out.println("Character array elements are : ");  
        for (int i = 0; i < len; i++) 
        {  
            System.out.print(ch[i]+" ");  
        }  
        System.out.println("\n");
		String[] arr=str.split(" ");
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(q5.check(arr[i]))
			{
				 System.out.println(arr[i]+"  is a palindrome");
			}
			else
			{
				System.out.println(arr[i]+"  is not a palindrome");
			}
		}
	}
}

