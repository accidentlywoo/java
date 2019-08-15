package swexpert.j3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		LinkedHashMap<String, String> map2 = new LinkedHashMap<String, String>();
		// map2는 순서가 보장됨
		TreeMap<String, String> map3 = new TreeMap<String, String>();
		//key를 기준으로 오름차순 정렬
		
		map.put("w","01010111111");
		map.put("y","01012222212");
		map.put("h","01013333333");
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+ map.get(key));
		}
	}
}
