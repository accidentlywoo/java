package swexpert;

public class BitOpTest {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		// exclusive or
		int i, j;
		i = a << 2;
		j = b >> 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(i);
		System.out.println(j);
	}
}
