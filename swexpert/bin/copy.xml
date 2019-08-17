package swexpert.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest {
	public static void main(String[] args) throws IOException {
		FileInputStream input = null;
		BufferedInputStream buffInput = null;
		FileOutputStream output = null;
		BufferedOutputStream buffOutput = null;
		
		input = new FileInputStream("./src/artifacts.xml");
		buffInput =new BufferedInputStream(input);
		output = new FileOutputStream("./src/copy.xml");
		buffOutput = new BufferedOutputStream(output);
		
		long start = System.currentTimeMillis();
		int ch = 0;
		while ((ch = buffInput.read())!= -1) {
			buffOutput.write(ch);
		}
		long end = System.currentTimeMillis();
		buffInput.close();
		input.close();
		buffOutput.close();
		output.close();
		System.out.println(end-start);
	}
}
