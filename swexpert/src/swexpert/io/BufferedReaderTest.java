package swexpert.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("./src/swexpert/io/BufferedReaderTest.java");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String data = null;
			int lineNumber = 0;
			while((data = bufferedReader.readLine())!= null) {
				System.out.println(++lineNumber+" : "+data+"\n");
			}
			bufferedReader.close();
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
