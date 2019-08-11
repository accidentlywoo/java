package swexpert.j2;

public class Employee {
	//멤버 변수
	private String name;
	private int number;
	private String dept;
	
	//생성자
	public Employee(String name, int number, String dept) {
		this.name = name;
		this.number = number;
		this.dept = dept;
	}
	
	//메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", dept=" + dept + "]";
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
