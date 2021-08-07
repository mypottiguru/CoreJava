package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(5);

		System.out.println(list);

		System.out.println("=====collect method for greater than 5 value list====");
		list.stream().filter(x -> (x > 5)).collect(Collectors.toList()).forEach(y -> System.out.println(y));

		System.out.println("======count method=====");
		long counts = list.stream().count();
		System.out.println("count:" + counts);

		System.out.println("========Sort method========");
		list.stream().sorted().forEach(x -> System.out.println(x));

		System.out.println("========Sort method for desending oreder========");
		list.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(x -> System.out.println(x));

		System.out.println("=========min method=====");
		Integer minValue = list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Min:" + minValue);

		System.out.println("=========max method=====");
		Integer maxValue = list.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Max:" + maxValue);

		System.out.println("======toArray method=====");
		Object[] objList = list.stream().toArray();
		for (Object obj : objList) {
			System.out.println(obj);
		}
		System.out.println("of method");
		Stream.of(1, 11, 22, 444, "Hello", 1.00).forEach(x -> System.out.println(x));

	}

}
