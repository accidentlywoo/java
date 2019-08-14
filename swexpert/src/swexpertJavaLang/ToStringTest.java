package swexpertJavaLang;

class Car2 {
	String name;
	int speed;
	
	public Car2(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public String toString() {
		return "Car2 객체의 정보 : "+name+","+speed;
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		Car2 car = new Car2("Red", 220);
		System.out.println(car.toString());
		System.out.println(car);
		/*
		 *  toString()메서드는 System.out.println()에서 사용될 때, 자동으로
		 *  호출되기 때문에 실행 결과가 동일함
		 */
	}
}
