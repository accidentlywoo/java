package swexpert.j2;

class Dice {
	public static int dotCount = 5;
	public int rollingCount = 0;
	
	public static void playGame() {
		dotCount++;
		// rollingCount++;
		// 인스턴스 변수로 선언된 rollingCount변수는 접근 불가
		 System.out.println(rollingDice());
		 System.out.println(dotCount);
	}
	public static int rollingDice() {
		int generateNum = (int)(Math.random() * 6) + 1;
		return generateNum;
	}
}

public class StaticMethodTest1 {
	public static void main(String[] args) {
		Dice.playGame();
	}
}
