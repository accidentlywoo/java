package swexpert.io;

import java.io.IOException;

public class StdIOTest {
	public static void main(String[] args) {
		int bt;
		int cnt = 0;
		try {
			while ((bt = System.in.read()) != -1) {
				cnt++;
				System.out.println((char)bt);
			}
		}catch (IOException e) {
			System.err.println(e);
		}
		System.out.println("total bytes : "+ cnt);
	}
}
