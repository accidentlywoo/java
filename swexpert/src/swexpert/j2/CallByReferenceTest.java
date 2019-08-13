package swexpert.j2;

public class CallByReferenceTest {
	public static void main(String[] args) {
		int[] scoreList = {40, 78, 98};
		System.out.println("변경 전 scode : "+ scoreList[0]);
		System.out.println("reference address1 : "+scoreList);
		changeScore(scoreList);
		System.out.println("변경 후 scode : "+ scoreList[0]);
	}
	
	private static int[] changeScore(int[] scoreList) {
		scoreList[0] = 100;
		//scoreList 변수가 참조하는 객체의 0번쨰 인덱스의 값을 100으로 수정
		System.out.println("변경된 score : "+ scoreList[0]);
		/*
		 * scoreList 변수가 참조하는 객체의 0번 인덱스의 값을 100으로 수정
		 * main메서드의 scoreList변수가 참조하는 배열 객체도 동일한 객체임으로
		 * main메서드에서 배열의 값을 출력하면 변경된 값이 출력됨
		 */
		System.out.println("reference address2 : "+scoreList);
		return scoreList;// 변경 배열객체를 리턴함
	}
}
