package Day14_FileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandeling4 {

	public static void main(String[] args) {

	try {
	File f1 = new File("C:\\\\Users\\\\MY BOOK\\\\OneDrive\\\\Desktop\\\\JAVA TRAINING 20-01-22\\\\FileOperationExample.txt");
	Scanner dataReader = new Scanner(f1);
	while (dataReader.hasNextLine()) 
	{
	String fileData = dataReader.nextLine();
	System.out.println(fileData);
	}
	dataReader.close();
	} 
	catch (FileNotFoundException exception) {
	System.out.println("Unexcpected error occurred!");
	exception.printStackTrace();
	}
	}
	}