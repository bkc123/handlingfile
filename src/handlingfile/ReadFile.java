package handlingfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends WriteFile{
	
	public void read() throws IOException {
		try(FileReader fileReader= new FileReader(txtFile); 
			BufferedReader bufferReader = new BufferedReader(fileReader);){
			String line;
			while((line= bufferReader.readLine()) !=null) {
				System.out.println(line + " from " + txtFile + '\n');
			}
		}
		
	}

}
