package MapInterface.HashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("four", 4);
		map.put("three", 3);

		System.out.println(map);
		System.out.println("-----------------");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key:" + entry.getKey() + ",Value:" + entry.getValue());
		}
		System.out.println("-----------------");

		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key:" + entry.getKey() + ",Value:" + entry.getValue());
		}
		System.out.println("-----------------");

		Set<Entry<String, Integer>> set1 = map.entrySet();

		Iterator<Entry<String, Integer>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<String, Integer> entry = it1.next();
			System.out.println("Key:" + entry.getKey() + ",Value:" + entry.getValue());

		}
		System.out.println("-----------------");

		map.forEach((K, V) -> {
			System.out.println("Key:" + K + ",Value:" + V);
		});

	}

}
