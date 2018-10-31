package Functions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	
	public  static BufferedWriter CreateFile(String Filepath) throws IOException {
		FileWriter filewriter= new FileWriter(Filepath);
		BufferedWriter bufferwrt= new BufferedWriter(filewriter);
		return bufferwrt;
	}


}
