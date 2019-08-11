package swexpert.j2;

interface Paintable {
	public void paint();
}

interface Drawable2 {
	public int PLAIN_PEN = 1;
	public int BOLD_PEN = 2;
	public int ITALIC_PEN = 3;
	
	public void draw();
	
	public void move(int x, int y);
}

interface Printable extends Paintable, Drawable {
	public void print();
}

class Circle2 implements Printable {
	public void draw() {
		System.out.println("원 그림");
	}
	
	public void move(int x, int y) {
		System.out.println("원 이동");
	}

	@Override
	public void paint() {
		System.out.println("원 색칠");
	}

	@Override
	public void print() {
		System.out.println("원 출력");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.draw();
		c.move(5, 5);
		c.paint();
		c.print();
	}
}
