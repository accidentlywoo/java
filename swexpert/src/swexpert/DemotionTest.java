package swexpert;

public class DemotionTest {
	public static void main(String[] args) {
		byte b1;
		char c1;
		int i1 = 128;
		int i2 = 97;
		double d1 = 3.14;
		System.out.println("명시적 형변환의 결과");
		b1 = (byte) i1;
		
		System.out.println(b1);
		c1 = (char) i2;
		
		System.out.println(c1);
		i1 = (int) d1;
		
		System.out.println(i1);
	}
}
