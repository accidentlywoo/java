package swexpert.j2;

public class Car {
	public String name; //public 정보 공개
	private int currentSpeed; //private 정보 은닉
	public int currentGear;
	
	public void startEngine() {
		System.out.println(name+"의 시동을 켠다.");
		setCurrentSpeed(1);
	}
	
	public void changeGear(int gear) {
		System.out.println(gear+"단으로 변경한다.");
		currentGear = gear;
	}
	
	private int getCurrentSpeed() {
		currentSpeed = currentSpeed + (currentGear * 10);
		return currentGear;
	}
	
	public void stopEngine() {
		System.out.println(name+"시동을 끈다");
		setCurrentSpeed(0);
	}
	
	public String getCurrentState() {
		return name+"의 현재속도 : " + getCurrentSpeed(); 
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}
