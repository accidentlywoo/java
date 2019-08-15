package swexpert.j3;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date currentDate = new Date();
		long start = currentDate.getTime();
		
		System.out.println(currentDate);
		System.out.println(currentDate.toLocaleString());
		
		currentDate = new Date();
		long end = currentDate.getTime();
		System.out.println("프로그램 수향에 걸린 시간 : "+ (end - start) + "(ms)초");
	}
}
