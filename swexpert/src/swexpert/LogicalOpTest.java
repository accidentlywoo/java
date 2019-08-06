package swexpert;

public class LogicalOpTest {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 2;
		int num3 = 0;
		System.out.println((num1 == num2) && (num1 / num3)>0);
		/*
		 *  &&, || 는 단축 연산자 논리적으로 전체비교를 안하는 경우가 있어 빠르다. 
		 *  &, | 는 무조건 전체비교
		 */
		
		System.out.println((num1 == num2) & (num1 / num3)>0);
		// 오류 발생쓰~
		System.out.println((num1 == num2) || (num1 / num3)>0);
		System.out.println((num1 == num2) | (num1 / num3)>0);
	}
}
