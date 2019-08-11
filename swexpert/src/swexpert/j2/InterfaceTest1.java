package swexpert.j2;

interface Drawable{
	public int PLAIN_PEN = 1;
	public int BOLD_PEN = 2;
	public int ITALIC_PEN = 3;
	public void draw();
	public void move(int x, int y);
}

class Shape{
	int x = 0;
	int y = 0;
	
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape implements Drawable{
	int radius;
	
	Circle(int x, int y,int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw() {
		System.out.println(x+","+y+"_"+radius);
	}

	public void move(int x, int y) {
		System.out.println((+x+this.x)+","+(y+this.y)+"_"+radius);
	}
	
}

class Rectangle extends Shape implements Drawable{
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println(x+","+y+"_"+(width+height));
	}

	@Override
	public void move(int x, int y) {
		System.out.println(this.x+x+","+(this.y+y)+"_"+(width+height));
	}
	
}


public class InterfaceTest1 {
	public static void main(String[] args) {
		Circle c = new Circle(10,10,100);
		Drawable d = new Circle(10, 10, 100);
		c.draw();
		c.move(5, 5);
		//d.radius
		
		Rectangle r = new Rectangle(20, 20, 50, 50);
		 d = new Rectangle(20,20,50,50);
		r.draw();
		r.move(5, 10);
	}
}
