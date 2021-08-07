package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GreaterThanValueList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(60);
		list.add(80);
		list.add(30);
		
		System.out.println(list);
		
		Stream stream = list.stream();
		stream.forEach(x -> System.out.println(x));
		

		List<Integer> greaterThan50ValueList1 = new ArrayList<>();
		for (Integer i : list) {
			if (i > 50) {
				greaterThan50ValueList1.add(i);
			}
		}
		System.out.println(greaterThan50ValueList1);

		// using stream
		List<Integer> greaterThan50ValueList2 = list.stream().filter(x -> x > 50).collect(Collectors.toList());
		System.out.println(greaterThan50ValueList2);
		
		// using stream
		list.stream().filter(x -> x>50).forEach(y -> System.out.println(y));
	}

}
