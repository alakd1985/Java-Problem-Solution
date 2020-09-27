package miscellaneous;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {

	public static void main(String[] args) throws IOException {
		FileWriter fwWriter = new FileWriter("C:\\Users\\Dell\\Desktop\\vv.txt");
		BufferedWriter bfWriter = new BufferedWriter(fwWriter);
		
		
		bfWriter.write("Alak");
		bfWriter.write("Toma");
		bfWriter.close();

	}

}
