package miscellaneous;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		FileReader flReader = new FileReader("C:\\Users\\Dell\\Desktop\\vv.txt");
		BufferedReader bfReader = new BufferedReader(flReader);
		
		String str;
		
		while ((str=bfReader.readLine()) !=null) {
			System.out.println(str);
		}

	}

}
