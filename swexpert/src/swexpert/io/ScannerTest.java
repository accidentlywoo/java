package swexpert.io;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner keyboard = new Scanner(in);
		
		System.out.println("이름 입력");
		String name = keyboard.nextLine();
		
		System.out.println("폰 입력");
		String phone = keyboard.nextLine();
		
		keyboard.close();
		System.out.println(name +", "+phone);
	}
}
