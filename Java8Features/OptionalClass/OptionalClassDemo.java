package Java8Features.OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Rajesh"));
		list.add(new Student(2, null));

		System.out.println(list);

		for (Student e : list) {
			try {
				System.out.println(e.getName().toUpperCase());
			} catch (NullPointerException ex) {
				System.out.println("Null Pointer Exception");
			}
		}
		
		System.out.println("========Optional Demo======");
		for(Student s: list) {
			Optional<String> o = Optional.ofNullable(s.getName());
			if(o.isPresent()) {
				System.out.println(s.getName());
			}
		}
		
	}
}
