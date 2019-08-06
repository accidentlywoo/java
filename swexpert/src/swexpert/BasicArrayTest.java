package swexpert;

public class BasicArrayTest {
	public static void main(String[] args) {
		int[] scoreList;
		scoreList = new int[5];
		scoreList[0] = 1;
		scoreList[1] = 2;
		scoreList[2] = 3;
		scoreList[3] = 4;
		scoreList[4] = 5;
		
		// 같은 방법
		int[] scoreList2 = { 1,2,3,4,5};
		System.out.println(scoreList2.length);
		System.out.println(scoreList2[0]);
		System.out.println(scoreList2[1]);
		System.out.println(scoreList2[2]);
		System.out.println(scoreList2[3]);
		System.out.println(scoreList2[4]);
	
	}
}
