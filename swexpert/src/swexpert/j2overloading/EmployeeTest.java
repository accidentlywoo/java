package swexpert.j2overloading;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee woo = new Employee(12345,"이선영");
		System.out.println(woo.getEmployeeInfo());
		
		Employee ㅁ = new Employee(123456,"박재성", 36);
		System.out.println(ㅁ.getEmployeeInfo());
		
		Employee ㄹ = new Employee(123457,"ㅁ",27,40);
		System.out.println(ㄹ.getEmployeeInfo());
	}
}
