package swexpert;

public class ReturnTest {
	public static void main(String[] args) {
		System.out.println("-main-");
		methodA();
	}
	private static void methodA() {
		System.out.println("-methodA()-");
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				return;
			}
			System.out.println(i);
		}
	}
}
