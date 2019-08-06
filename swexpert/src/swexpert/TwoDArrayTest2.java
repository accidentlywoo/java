package swexpert;

public class TwoDArrayTest2 {
	public static void main(String[] args) {
		String[][] scoreList = new String[3][];
		
		scoreList[0] = new String[2];
		scoreList[1] = new String[3];
		scoreList[2] = new String[4];
		
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < scoreList[i].length; j++) {
				scoreList[i][j] = "["+ i +"]["+ j +"]요소";
				System.out.println(scoreList[i][j]);
			}
			System.out.println(" ");
		}
	}
}
