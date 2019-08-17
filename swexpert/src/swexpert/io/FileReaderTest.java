package swexpert.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("./src/swexpert/io/FileReaderTest.java");
			
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
