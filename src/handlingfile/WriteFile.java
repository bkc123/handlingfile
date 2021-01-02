package handlingfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	// create a new file
	File txtFile= new File("myFileNam.txt");
	
	//methods to write on a created txt file
	public void write() throws IOException {
		try (FileWriter myWriter= new FileWriter(txtFile);){
			myWriter.write("It is my 1st line in txtFile\n");
			String s = "Hi!!! Hello!";
			//write something to add on existing txtfile
			myWriter.write(s);
			System.out.println("Successfully, wrote on txt file");
			
		}catch(IOException e) {
			System.out.println("Sorry, Unable to write in txt file");
		}
	}
	
	Scanner sn= new Scanner(System.in);
	
	//separate methods to append a new line on txt file 
	public void append() throws IOException{
		try(BufferedWriter appendWriter = new BufferedWriter(new FileWriter(txtFile, true));){
			System.out.println("\nPlease enter the txt you want to enter: ");
			String s= sn.nextLine();
			appendWriter.write('\n'+s);
		}
	}
	
}



