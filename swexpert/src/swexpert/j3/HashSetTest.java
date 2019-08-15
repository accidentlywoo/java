package swexpert.j3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("9.5");
		set.add("8.4");
		set.add("9.2");
		set.add("9.5");
		
		set.add("6.7");
		System.out.println(set);
		
		set.remove("9.2");
		System.out.println(set);
		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("9.5");
		set1.add("8.4");
		set1.add("9.2");
		set1.add("9.5");
		
		set1.add("6.7");
		System.out.println(set1);
		
		set1.remove("9.2");
		System.out.println(set1);
	}
}
