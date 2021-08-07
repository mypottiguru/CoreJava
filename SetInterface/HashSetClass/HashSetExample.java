package SetInterface.HashSetClass;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("two");
		hs.add("two");
		hs.add("One");
		hs.add("Three");
		hs.add("Six");
		hs.add(null);
		System.out.println(hs);

		Set<String> hs2 = new HashSet<>(hs);
		hs2.add("Four");
		hs2.add("Five");

		System.out.println(hs2);

	}

}
