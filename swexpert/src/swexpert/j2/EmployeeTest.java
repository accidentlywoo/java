package swexpert.j2;

class Employee3 {
	String name;
	int employeeNo;
	int age;
	final static String companyName = "S전자";
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee3 woo = new Employee3();
		woo.name = "우연희";
		woo.employeeNo = 1234;
		woo.age = 27;
		//woo.companyName = "A전자";
		
		Employee3 lee = new Employee3();
		lee.name = "이선영";
		lee.employeeNo = 12345;
		lee.age = 30;
		
		Employee3 park = new Employee3();
		park.name = "박재성";
		park.employeeNo = 1234567;
		park.age = 28;
		
		Employee3 defaultTest = new Employee3();
		System.out.println(defaultTest.name);
		System.out.println(defaultTest.employeeNo);
		System.out.println(defaultTest.age);
	}
}
