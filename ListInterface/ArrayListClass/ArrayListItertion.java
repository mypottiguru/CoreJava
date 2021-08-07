package ListInterface.ArrayListClass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListItertion {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("c", "c++", "java");
		System.out.println(courses);
		System.out.println("-----------------");

		// basic for loop
		System.out.println("basic for loop:");
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		System.out.println("-----------------");
		// enhanced for loop
		System.out.println("enhanced for loop:");
		for (String course : courses) {
			System.out.println(course);
		}
		System.out.println("-----------------");
		// iterator
		System.out.println("iterator:");
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println("-----------------");
		// while
		System.out.println("while loop:");
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println("-----------------");

		// java 8 stream + lamda
		System.out.println("stream lamda:");
		courses.stream().forEach(action -> System.out.println(action));
		System.out.println("-----------------");
		// java forEach lamda
		System.out.println("forEach lamda:");
		courses.forEach(action -> System.out.println(action));
	}

}
