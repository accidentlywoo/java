package swexpert.j2;

class SuperClass {
	int num1;
	
	public SuperClass() {
		System.out.println("SuperClass 객체 생성");
		num1 = 100;
	}
}

class SubClass extends SuperClass {
	int num2;
	/*
	 * SuperClass 클래스의 생성자를 호출하는 소스코드가 없음
	 * -> 기본 생성자가 실행됨
	 * ! 이떄 부모클래스에 기본 생성자가 없다면 에러가 발생함
	 */
	public SubClass() {
		System.out.println("SubClass 객체 생성");
		num2 = 1000;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.num1);
		System.out.println(sub.num2);
	}
}
