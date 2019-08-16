package swexpert.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) throws IOException{
		FileInputStream input = null;
		FileOutputStream output = null;
		
		input = new FileInputStream("./src/artifacts.xml");
		output = new FileOutputStream("./src/copy.xml", false);
		int size = input.available();
		/*
		 *  파일에서 읽어 들일 수 있는 가용량을 파악할 수 있으므로 파일을 통째로 읽을 수 있음
		 *  파일의 크기가 아주 크면 프로그램에서 만드는 버퍼의 크기도 따라서 커짐
		 *  입출력을 최소화하시 위하여 한 번의 입력으로 파일의 모든 내용을 버퍼로 가져온 후,
		 *  한 번의 출력으로 다른 파일로 저장함
		 */
		byte[] buff = new byte[size];
		long start = System.currentTimeMillis();
		
		int readCount = input.read(buff);
		output.write(buff, 0, readCount);
		/*
		int ch = 0;
		while ((ch = input.read())!= -1) {
			output.write(ch);
		}
		*/
		long end = System.currentTimeMillis();
		System.out.println((end-start));
		input.close();
		output.close();
	}
}
