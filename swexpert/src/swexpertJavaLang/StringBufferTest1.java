package swexpertJavaLang;

public class StringBufferTest1 {
	public static void main(String[] args) {
		String str = "회사명 : ";
		str.concat("자바전자");
		System.out.println(str);
		
		StringBuffer strbuff = new StringBuffer("회사명 : ");
		
		strbuff.append("자바전자");
		System.out.println(strbuff);
	}
}
