package Day14_FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class InputOutputStream1 {

	public static void main(String[] args) throws IOException

	{
	String str = "File Handling in Java using "+" FileWriter and FileReader";
	FileWriter fw=new FileWriter("C:\\Users\\MY BOOK\\OneDrive\\Desktop\\JAVA TRAINING 20-01-22\\output.txt");
	for (int i = 0; i < str.length(); i++)
	fw.write(str.charAt(i));
	System.out.println("Writing successful");
	fw.close();

	}

	}
