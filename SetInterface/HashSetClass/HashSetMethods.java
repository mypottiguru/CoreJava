package SetInterface.HashSetClass;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(1);
		hs.add(3);
		hs.add(6);
		System.out.println(hs);

		hs.add(6);
		System.out.println("After adding dupicate:" + hs);

		hs.add(null);
		System.out.println("After adding null:" + hs);

		hs.remove(2);
		System.out.println("After remove 2:" + hs);

		Set<Integer> hs1 = new HashSet<>();
		hs1.add(2);
		hs1.add(1);

		hs.removeAll(hs1);
		System.out.println(hs);

		hs.clear();
		System.out.println(hs);

	}

}
