package swexpert;

public class ArrayTest {
	public static void main(String[] args) {
		//자바 정수 5개를 저장할 수 있는 정수형 배열 생성
		int[] javaScore = new int[5];
		
		//1. 명령형 매개변수로 들어온 5개의 자바 정수를 배열에 저장
		javaScore[0] = Integer.parseInt(args[0]);
		javaScore[1] = Integer.parseInt(args[1]);
		javaScore[2] = Integer.parseInt(args[2]);
		javaScore[3] = Integer.parseInt(args[3]);
		javaScore[4] = Integer.parseInt(args[4]);
				
		//2. 배열에 저장된 자바 점수의 총합 구하기
		int sumScore = 0;
		sumScore = javaScore[0] + javaScore[1] + javaScore[2] + javaScore[3] + javaScore[4];
	
		//3. 자바 점수의 퍙균 구하기
		double avgScore = 0.0;
		avgScore = (double)sumScore/javaScore.length;
		
		//총합과 평균 출력
		System.out.println(sumScore);
		System.out.println(avgScore);
		/*
		 * 
		 */
	}
}
