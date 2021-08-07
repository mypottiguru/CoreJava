package ObjectClass.Sorting;

import java.util.Comparator;

public class IdComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.getId() > s2.getId()) {
			return 1;
		} else if (s1.getId() < s2.getId()) {
			return -1;
		}
		return 0;
	}

}
