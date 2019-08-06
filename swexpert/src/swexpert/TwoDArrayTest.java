package swexpert;

public class TwoDArrayTest {
	public static void main(String[] args) {
		String[][] scoreList = new String[3][4];
		
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < scoreList[i].length; j++) {
				scoreList[i][j] = "["+ i +"]["+ j +"]요소";
				System.out.println(scoreList[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
