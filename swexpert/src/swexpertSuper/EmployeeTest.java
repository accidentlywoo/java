package swexpertSuper;

class Employee1 {
	String name;
	int deptNo;
	String grade;
}

class Manager1 extends Employee1 {
	String boss;
	char grade;
	
	void printGrade() {
		this.grade = 'A';
		super.grade = "A등급";
		System.out.println(this.grade);
		System.out.println(super.grade);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Manager1 woo = new Manager1();
		woo.printGrade();
	}
}
