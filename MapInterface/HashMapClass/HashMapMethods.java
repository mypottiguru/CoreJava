package MapInterface.HashMapClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("four", 4);
		map.put("three", 3);
		System.out.println(map);

		System.out.println(map.isEmpty());

		System.out.println(map.size());

		System.out.println(map.get("one"));

		Set<String> s1 = map.keySet();

		System.out.println(s1);

		Collection<Integer> c1 = map.values();

		System.out.println(c1);

		System.out.println(map.containsKey("one"));

		System.out.println(map.containsValue(1));

		map.remove("two");

		System.out.println(map);

	}

}
