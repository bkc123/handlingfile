package handlingfile;

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
		System.out.println("Successfully, added three line on existing txt file");
		rfile.append();
		rfile.append();
		rfile.read();
		System.out.println("Successfully, added  another extra two line on txt file");
		

	}

}
