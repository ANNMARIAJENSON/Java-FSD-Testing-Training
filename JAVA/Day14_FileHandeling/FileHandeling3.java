package Day14_FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

class FileHandeling3 {

public static void main(String[] args) {

try {

FileWriter fwrite = new FileWriter("C:\\\\Users\\\\MY BOOK\\\\OneDrive\\\\Desktop\\\\JAVA TRAINING 20-01-22\\\\FileOperationExample.txt");
fwrite.write("A named location used to store related information is referred to as a File.");
fwrite.close();
System.out.println("Content is successfully wrote to the file.");
} 
catch (IOException e) {
System.out.println("Unexpected error occurred");
e.printStackTrace();

}

}

}