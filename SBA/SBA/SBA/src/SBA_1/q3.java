/*3.Create two array list of strings to take First_name and Last_name of the
students,and print their whole name.*/

package SBA_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		ArrayList <String> firstName = new ArrayList <String>();
		ArrayList <String> lastName = new ArrayList <String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students :");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Firstname "+i);
			firstName.add(sc.next());
			System.out.println("Enter lastname "+i);
			lastName.add(sc.next());	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Full name :"+(i+1)+" " +firstName.get(i)+" "+lastName.get(i));
		}
		}
	}


