package MapInterface.HashMapClass;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		map.put("one", 1);
		map.put("one", 1);//replace this obj
		map.put("two", 2);
		map.put("four", 4);
		map.put("three", 3);
		map.put("five", 5);
		System.out.println(map);
		
	}

}
