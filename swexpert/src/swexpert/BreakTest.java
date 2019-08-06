package swexpert;

public class BreakTest {
	public static void main(String[] args) {
		int[] scoreList = {6,5,4,3,2,1};
		int maxScore = 10;
		int scoreSum = 0;
		for(int i = 0; i < scoreList.length; i++) {
			scoreSum = scoreSum + scoreList[i];
			if(scoreSum > maxScore) {
				scoreSum = scoreSum - scoreList[i];
				break;
			}
		}
		System.out.println(scoreSum);
	}
}
