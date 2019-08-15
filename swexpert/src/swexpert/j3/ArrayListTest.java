package swexpert.j3;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Double> scoreList = new ArrayList<Double>();
		scoreList.add(9.5);
		scoreList.add(8.4);
		scoreList.add(1, 9.2);
		
		scoreList.add(9.5);
		System.out.println(scoreList);
		
		double minScore = 100;
		double maxScore = 0;
		double score = 0;
		for(int i = 0; i < scoreList.size(); i++) {
			score = scoreList.get(i);
			if(score < minScore)
				minScore = score;
			if(score > maxScore)
				maxScore = score;
		}
		scoreList.remove(minScore);
		scoreList.remove(maxScore);
		System.out.println(scoreList);
	}
}
