package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Java");

		System.out.println(list);

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("============");
		list.forEach(x -> System.out.println(x));

		System.out.println("============");
		list.stream().forEach(y -> System.out.println(y));

	}

}
