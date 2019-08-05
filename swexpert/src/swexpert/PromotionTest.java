package swexpert;

public class PromotionTest {
	public static void main(String[] args) {
		byte b1 = 127;
		char c1 = '가';
		int i1;
		double d1;
		System.out.println("자동 형변환의 결과");
		i1 = b1;
		
		System.out.println(i1);
		i1 = c1;
		
		System.out.println(i1);
		d1 = i1;
		
		System.out.println(d1);
	}
}
