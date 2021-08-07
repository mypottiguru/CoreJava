package ObjectClass.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<>();
		l1.add(new Student(2, "Kumar"));
		l1.add(new Student(1, "Mahesh"));
		l1.add(new Student(3, "Rajesh"));
		l1.add(new Student(4, "Akhil"));
		Collections.sort(l1,new IdComparator());
		for(Student s: l1) {
			System.out.println(s);
		}
	}

}
