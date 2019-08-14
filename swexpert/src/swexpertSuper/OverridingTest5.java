package swexpertSuper;

class Printer {
	String name;
	int sheets;
	
	public void ready() {
		System.out.println(name + "프린터를 예열한다.");
	}
	public final void printLogic() {
		ready();
		for(int i = 0; i < 3; i++) {
			System.out.println(name+"로"+sheets+"장 씩 출력한다.");
		}
		close();
	}
	public void close() {
		System.out.println(name+" 프린터를 종료한다.");
	}
}

class DotPrinter extends Printer {
	int batteryGage;
	/*
	public void printLogic() {
		// ready(), close() 메서드 호출이 없기 때문에 문제가 발생
		for(int i = 0; i < 2; i++) {
			System.out.println(name+"로"+sheets+"장 씩 출력한다.");
		}
		System.out.println("현재 배터리"+batteryGage);
	}
	*/
}

public class OverridingTest5 {
	public static void main(String[] args) {
		DotPrinter printer = new DotPrinter();
		printer.name = "x50";
		printer.sheets = 3;
		printer.batteryGage = 57;
		printer.printLogic();
	}
}
