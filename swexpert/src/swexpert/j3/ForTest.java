package swexpert.j3;

import java.util.Vector;

public class ForTest {
	public static void main(String[] args) {
		int[] scoreList = {50, 45, 99, 85, 100};
		int scoreSum = 0;
		for (int score : scoreList) {
			scoreSum = scoreSum + score;
		}
		System.out.println(scoreSum);
		System.out.println("-----확장 for문-----");
		
		Vector<String> subjectList = new Vector<String>();
		subjectList.add("Java");
		subjectList.add("SQL");
		subjectList.add("Servlet");
		
		for(String subject : subjectList) {
			System.out.println(subject);
		}
	}
}
