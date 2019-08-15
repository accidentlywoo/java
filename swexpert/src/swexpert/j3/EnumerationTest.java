package swexpert.j3;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("자바"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.elementAt(i));
		}
		Enumeration e = list.elements();
		//Enumeration 객체를 생성하여 Vectir의 요소들을 여기에 복사하여 저장함
		System.out.println();
		System.out.println("Vector로부터 생성한 Enumeration의 요소들");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
