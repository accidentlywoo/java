package swexpert.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("./src/Test.java");
		String fileName = file.getName();
		if(file.exists()) {
			try {
				System.out.println(fileName);
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getCanonicalPath());
				System.out.println(file.getParent());
				if(file.canWrite()) {
					System.out.println(fileName+"canWriting");
				}
				if(file.canRead()) {
					System.out.println(fileName+"canReading");
				}
				System.out.println(fileName+"의 크기 : "+ file.length());
			}catch (IOException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("404"+fileName);
		}
	}
}
