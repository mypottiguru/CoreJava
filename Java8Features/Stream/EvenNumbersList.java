package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersList {

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

		// Getting Even numbers of list
		List<Integer> evenList1 = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				evenList1.add(i);
			}
		}
		System.out.println(evenList1);

		// Getting Even numbers of list with stream lamda
		System.out.println("===========");
		List<Integer> evenList2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList2);

	}

}
