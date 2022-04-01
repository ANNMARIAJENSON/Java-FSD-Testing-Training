/*4.Write a program Implement the filereader until the file ending character is “-
1” and print all the data of the file.*/
package SBA_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q4 {
	public static void main(String[] args) throws IOException {
		int ch;
		FileReader fr=null;
		try
		{
			fr = new FileReader("C:\\Users\\MY BOOK\\OneDrive\\Desktop\\JAVA TRAINING 20-01-22\\Question1.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}
		System.out.println("This is the content read from the file : "+"\n");
		while ((ch=fr.read())!=-1)
		System.out.print((char)ch);
		fr.close();

	}

}
