package swexpert;

public class FistApp {
	boolean win;
	public void setWin(int s) {
		int score = s;
		if(score > 10) {
			win = true;
		}
	}
	public void printWinner() {
		if(win == true) {
			System.out.println("이기다.");
		}else {
			System.out.println("지다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("첫 자바는 아니고;;");
		/*
		 * System : 클래스
		 * out : 변수
		 * println : 메서드
		 */
		//int num1 = 2147483648;
		int num1 = 2147483647;
		int num2 = 1;
		
		int num3 = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3); //-2147483648
	}

}
