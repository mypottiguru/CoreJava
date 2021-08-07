package ListInterface.LinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteration {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("One");
		ll.add("three");
		ll.add("two");
		ll.add("four");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		for (String string : ll) {
			System.out.println(string);

		}

		Iterator<String> i = ll.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		ll.forEach(list -> {
			System.out.println(list);
		});

		ll.stream().forEach(list -> {
			System.out.println(list);
		});

	}

}
