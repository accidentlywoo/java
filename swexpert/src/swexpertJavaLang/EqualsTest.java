package swexpertJavaLang;

class Car {
	String name;
	int speed;
	
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public boolean equals(Object obj) {
		Car other =  (Car) obj;
		if (name != other.name) {
			return false;
		}
		if(speed != other.speed)
			return false;
		return true;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Car car1 = new Car("Red", 220);
		Car car2 = new Car("Red", 220);
		
		if(car1 == car2)
			System.out.println("car1, car2 주소값이 같다");
		if(car1.equals(car2))
			System.out.println("car1, car2 값이 같다");
	}
}
