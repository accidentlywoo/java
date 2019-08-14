package swexpertSuper;

class SuperClass3{
	void print(String str) {
		System.out.println("Super의 print");
	}
}

class SubClass extends SuperClass3 {
	void print() {
		System.out.println("Sub의 print");
	}
}

public class OverridingTest3 {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.print("테스트");
		sub.print();
	}
}
