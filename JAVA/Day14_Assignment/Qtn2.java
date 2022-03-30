package Day14_Assignment;

import java.io.File;

public class Qtn2 {

	public static void main(String[] args) {
		File file = new File("C:\\\\Users\\\\MY BOOK\\\\OneDrive\\\\Desktop\\\\JAVA TRAINING 20-01-22\\\\Question1.txt");
		if (file.exists()) 
		{
			System.out.println("FILE INFO : ");
			System.out.println("The name of the file is: " + file.getName());
			System.out.println("The absolute path of the file is: " + file.getAbsolutePath());
			System.out.println("Is file writeable?: " + file.canWrite());
			System.out.println("Is file readable? :" + file.canRead());
			System.out.println("The size of the file in bytes is: " + file.length());
		} 
		else 
		{
		System.out.println("The specified file does not exist.");
		}
	}

}
