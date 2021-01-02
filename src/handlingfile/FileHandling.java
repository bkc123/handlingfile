package handlingfile;

import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadFile rfile= new ReadFile();
		rfile.write();
		rfile.append();
		rfile.append();
		rfile.append();
		rfile.read();
		System.out.println("Successfully, added another three line on txt file");
		rfile.append();
		rfile.append();
		rfile.read();
		

	}

}
