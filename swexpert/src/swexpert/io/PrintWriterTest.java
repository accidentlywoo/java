package swexpert.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader inReader = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inReader);
		
		FileOutputStream output = new FileOutputStream("./src/message.txt");
		PrintWriter writer = new PrintWriter(output, true);
		
		System.out.println("저장 메시지 입력");
		String msg = null;
		
		while ((msg = reader.readLine())!= null) {
			writer.println(msg);
		}
		reader.close();
	}
}
