package Day14_FileHandeling;

import java.io.File;
import java.io.IOException;

class FileHandeling1 {

public static void main(String args[]) {

try 
{
	File file = new File("C:\\Users\\MY BOOK\\OneDrive\\Desktop\\JAVA TRAINING 20-01-22\\FileOperationExample.txt");
	boolean create=file.createNewFile();
	if (create) {
	System.out.println("File " + file.getName() + " is created successfully.");
} 
else 
{
	System.out.println("File is already exist in the directory.");
}
} 
catch (IOException exception) 
{
	System.out.println("An unexpected error is occurred.");
	exception.printStackTrace();
}
}
}
