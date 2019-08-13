package swexpert.j2overloading;

public class Employee {
	int employeeNo;
	String name;
	int age;
	int salary;
	/*
	public Employee() {
		this.employeeNo = 0;
		this.name = "Anonymity";
		this.age = 0;
		this.salary = 0;
	}
	
	public Employee(int employeeNo, String name) {
		this.employeeNo = employeeNo;
		this.name = name;
	}
	
	public Employee(int employeeNo, String name, int age) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.age = age;
	}
	
	public Employee(int employeeNo, String name, int age, int salary) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	*/
	public Employee() {
		this(0,"Anonymity", 0, 0);
	}
	
	public Employee(int employeeNo, String name) {
		this.employeeNo = employeeNo;
		this.name = name;
	}
	
	public Employee(int employeeNo, String name, int age) {
		this(employeeNo, name);
		this.age = age;
	}
	public Employee(int employeeNo, String name, int age, int salary) {
		this(employeeNo, name, age);
		this.salary = salary;
	}
	
	public String getEmployeeInfo() {
		System.out.println(name +","+ age +","+ salary +","+ employeeNo);
		return name;
	}
}
