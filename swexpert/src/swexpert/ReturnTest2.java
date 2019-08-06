package swexpert;

public class ReturnTest2 {
	public static void main(String[] args) {
		int[] scoreList = {5,5,3,6,2};
		double avgScore = calcAvg(scoreList);
		System.out.println(avgScore);
	}
	
	private static double calcAvg(int[] scoreList) {
		int sum = 0;
		for(int i = 0; i < scoreList.length; i++) {
			sum = sum + scoreList[i];
		}
		return (double)sum/scoreList.length;
	}
}
