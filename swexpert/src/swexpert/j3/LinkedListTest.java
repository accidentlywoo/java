package swexpert.j3;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Double> scoreList = new LinkedList<Double>();
		scoreList.add(9.5);
		scoreList.addFirst(8.4);
		
		scoreList.add(9.2);
		scoreList.add(9.5);
		System.out.println(scoreList);
		
		double minScore = scoreList.getFirst();
		double maxScore = scoreList.getLast();
		
		scoreList.removeFirst();
		scoreList.removeLast();
		System.out.println(scoreList);
		
		double sum = 0;
		for(int i = 0; i < scoreList.size(); i++) {
			sum += scoreList.get(i);
		}
		
		System.out.println(minScore);
		System.out.println(maxScore);
	}
}
