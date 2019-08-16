package swexpert.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) throws Exception {
		int data;
		FileInputStream input = new FileInputStream("./src/swexpert/io/FileInputStreamTest.java");
		while ((data = input.available()) > 0) {
			
			byte[] bytes = new byte[data];
			int result = input.read(bytes);
			if(result == -1)
				break;
			String str = new String(bytes);
			System.out.println(str);
		}
		input.close();
	}
}
