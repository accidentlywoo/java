package swexpert.j2;

public class CallByValueTest {
	public static void main(String[] args) {
		int score = 10;
		System.out.println("변경 전 score : "+ score);
		
		chageScore(score);
		
		System.out.println("변경 후 score : "+ score);
	}
	
	private static int chageScore(int score) {
		score = 100;
		
		System.out.println("변경된 score : "+ score);
		
		return score;
	}
}
