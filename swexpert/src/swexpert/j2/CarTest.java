package swexpert.j2;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.name = "Red";
		myCar.currentGear = 0;
		myCar.setCurrentSpeed(0);
		
		//메서드 호출
		myCar.startEngine();
		System.out.println(myCar.getCurrentState());
		myCar.changeGear(2);
		System.out.println(myCar.getCurrentState());
		myCar.changeGear(3);
		System.out.println(myCar.getCurrentState());
		myCar.stopEngine();
		System.out.println(myCar.getCurrentState());
		
		Texi myTexi = new Texi();
		
		myTexi.name = "대현 운수 308";
		myTexi.currentGear = 2;
		myTexi.fare = 3400;
		myTexi.passengerYn = true;
		System.out.println(myTexi.getCurrentState());
		
		Driver kim = new Driver();
		kim.name = "sibal";
		
		System.out.println(kim.name);
		kim.driving();
	}
}
