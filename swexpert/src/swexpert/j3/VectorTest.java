package swexpert.j3;

import java.util.Date;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector list = new Vector(3);
		System.out.println(list.capacity());
		System.out.println(list.size());
		
		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("자바"));
		list.addElement(new Date());
		System.out.println("-----------");
		System.out.println(list.capacity());
		System.out.println(list.size());
		
		if(list.contains("자바"))
			System.out.println("자바 있쪄");
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.elementAt(i));
		}
	}
}
