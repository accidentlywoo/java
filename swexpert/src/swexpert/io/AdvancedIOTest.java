package swexpert.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AdvancedIOTest {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter writer = new PrintWriter(new FileWriter("./src/phoneList"),true);
		
		while(true) {
			System.out.println("이름 : ");
			String name = keyboard.nextLine();
			System.out.println("번호 : ");
			String phone = keyboard.nextLine();
			
			writer.write(name+" : "+phone);
			System.out.println("종료  : exit 계속 입력 : Enter입력");
			
			String flag = keyboard.nextLine();
			if(flag.equals("exit")) {
				break;
			}
		}
		keyboard.close();
		writer.close();
	}
}
