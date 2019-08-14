package swexpertJavaLang;

public class WrapperTest {
	public static void main(String[] args) {
		Boolean b1 = new Boolean("TRUE");
		Boolean b2 = new Boolean("????");
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Double d = new Double(10.0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(i1);
		System.out.println(d);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		if(i1.equals(i2))
			System.out.println("--같다");
		System.out.println(Character.isUpperCase('a'));
		System.out.println("-1의 이진수 : "+ Integer.toBinaryString(-1));
		System.out.println(Double.parseDouble("3.14"));
	}
}
