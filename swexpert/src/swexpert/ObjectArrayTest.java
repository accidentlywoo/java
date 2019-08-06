package swexpert;

public class ObjectArrayTest {
	public static void main(String[] args) {
		String nameList[];
		nameList = new String[3];
		
		nameList[0] = "Java";
		nameList[1] = "SQL";
		nameList[2] = "Servlet";
		System.out.println(nameList.length);
		
		String nameList2[] = {"Java", "SQL", "Servlet"};
		
		System.out.println(nameList2[0]);
		System.out.println(nameList2[1]);
		System.out.println(nameList2[2]);
	}
}
