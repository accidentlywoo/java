package swexpert.j2;

public class MethodTest {
	public static void main(String[] args) {
		/*
		int[] enScore = {55, 70, 45, 90, 100, 90, 95};
		int enSum = 0;
		for(int i = 0; i < enScore.length; i++) {
			enSum = enSum + enScore[i];
		}
		double enAvgScore = (double)enSum/enScore.length;
		System.out.println(enAvgScore);
		
		int[] koScore = {93, 55, 87, 80, 100, 95, 65};
		int koSum = 0;
		for(int i = 0; i < koScore.length; i++) {
			koSum = koSum + koScore[i];
		}
		
		double koAvgScore = (double)koSum/koScore.length;
		System.out.println(koAvgScore);
		 */
		int[] enScore = {55, 70, 45, 90, 100, 90, 95};
		System.out.println(getAvgScore(enScore));
		int[] koScore = {93, 55, 87, 80, 100, 95, 65};
		System.out.println(getAvgScore(koScore));
	}
	private static double getAvgScore(int[] scoreList) {
		int sum = 0;
		double avgScore = 0.0;
		for(int i = 0; i < scoreList.length; i++) {
			sum = sum + scoreList[i];
		}
		avgScore = (double)sum/scoreList.length;
		return avgScore;
	}
}
