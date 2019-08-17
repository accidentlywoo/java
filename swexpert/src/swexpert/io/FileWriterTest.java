package swexpert.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("./src/swexpert/io/FileReaderTest.java");
			FileWriter writer = new FileWriter("./src/swexpert/io/FileCopy.java");
			
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				writer.write((char) ch);
			}
			reader.close();
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
