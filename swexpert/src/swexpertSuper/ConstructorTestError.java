package swexpertSuper;

class SuperClass {
	int num1;
	
	// 기본 생성자가 없음
	
	public SuperClass(int num) {
		System.out.println("SuperClass 객체 생성");
		num1 = 100;
	}
}
/*
class SubClass extends SuperClass {
	int num2;
	
	 * SuperClass 클래스의 생성자를 호출하는 소스코드가 없음
	 * -> 기본 생성자가 실행됨
	 * ! 이떄 부모클래스에 기본 생성자가 없다면 에러가 발생함
	 
	public SubClass() { // 부모클래스에 기본 생성자가 없기 때문에 컴파일 되지 않음
		System.out.println("SubClass 객체 생성");
		num2 = 1000;
	}
	
}
*/
public class ConstructorTestError {

}
