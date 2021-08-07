package ObjectClass.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Person> l1 = new ArrayList<>();
		l1.add(new Person(1, "Sreenivas", 1000.00));
		l1.add(new Person(3, "Rahul", 3000.00));
		l1.add(new Person(2, "Akhil", 2000.00));
		l1.add(new Person(5, "Mohan", 5000.00));
		l1.add(new Person(4, "Kiran", 4000.00));
		Collections.sort(l1);
		for(Person p : l1) {
			System.out.println(p);
		}
	}

}
