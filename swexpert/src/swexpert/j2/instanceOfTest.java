package swexpert.j2;

class Employee2{}

class Manager extends Employee2{}

public class instanceOfTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee2 e = new Employee2();
		System.out.println(m instanceof Manager);
		System.out.println(m instanceof Employee2);
		System.out.println(e instanceof Manager);
	}
}
