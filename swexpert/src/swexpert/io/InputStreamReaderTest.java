package swexpert.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try {
			InputStream in = System.in;
			
			InputStreamReader reader = new InputStreamReader(in);
			
			BufferedReader buffReader = new BufferedReader(reader);
			
			System.out.println("--이름 입력--");
			String name = buffReader.readLine();
			
			System.out.println("--숫자 입력--");
			String phone = buffReader.readLine();
			
			buffReader.close();
			reader.close();
			in.close();
			System.out.println(name+", "+phone);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
