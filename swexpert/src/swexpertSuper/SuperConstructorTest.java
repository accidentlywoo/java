package swexpertSuper;

class Shape {
	int x = 0;
	int y = 0;
	
	Shape() {
		this(0, 0);
	}
	
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	int radius;
	Circle(int x, int y, int radius){
		super(x, y);// 명시적 호출
		// 항상 첫 번쨰 하인에 위치해야 함
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("원그리기"+x+","+y+","+radius);
	}
}

public class SuperConstructorTest {
	public static void main(String[] args) {
		Circle c = new Circle(200, 500, 100);
		c.draw();
	}
}
