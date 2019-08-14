package swexpertSuper;

class Employee {
	public String name;
	int employeeNo;
	//private int salary;
	int salary;
	int age;
	public String jobTitle;
	protected int deptNo;
	String grade;
}

class Manager extends Employee{
	String jobOfManage;
	String boss;
	//salary 상속 안됨
	char grade;
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager woo = new Manager();
		woo.name = "여니";
		woo.employeeNo = 12345;
		woo.salary = 540;
		woo.age = 27;
		woo.jobTitle = "개발";
		woo.deptNo = 105;
		//woo.grade = "A등급";
		woo.grade = 'A';
		woo.jobOfManage = "백";
		woo.boss = "성덩일";
	}
}
