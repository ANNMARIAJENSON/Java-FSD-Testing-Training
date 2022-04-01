//2.Write a program to create, write and read from a file.

package SBA_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		try 
		{
			File file = new File("C:\\Users\\MY BOOK\\OneDrive\\Desktop\\JAVA TRAINING 20-01-22\\SBA\\Question1.txt");
			boolean create=file.createNewFile();
			if (create) 
			{
				System.out.println("File - " + file.getName() + " is created successfully.");
			} 
			else 
			{
				System.out.println("File is already existing in the directory.");
			}
			//------------------writing to file & reading from file---------------------------
			try
			{
				FileWriter fwrite = new FileWriter("C:\\\\Users\\\\MY BOOK\\\\OneDrive\\\\Desktop\\\\JAVA TRAINING 20-01-22\\\\SBA\\\\Question1.txt");
				fwrite.write("This is the file created for question 1 and I have inserted data into this file according to my convenience");
				fwrite.close();
				System.out.println("Content is successfully wrote to the file.");
				
				File f1 = new File("C:\\\\Users\\\\MY BOOK\\\\OneDrive\\\\Desktop\\\\JAVA TRAINING 20-01-22\\\\SBA\\\\Question1.txt");
				Scanner dataReader = new Scanner(f1);
				while (dataReader.hasNextLine()) 
				{
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
				}
			}
			catch(IOException e)
			{
				System.out.println("Content not found in the file");
				System.out.println(e);
			}
		} 
		catch (IOException exception) 
		{
			System.out.println("An unexpected error has occurred.");
			System.out.println(exception);
		}

}
}
