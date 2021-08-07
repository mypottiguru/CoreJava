package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DoubleOfValueList {

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
		
		// Getting Double value numbers of list
		List<Integer> doubleofValueList1 = new ArrayList<>();
		for (Integer i : list) {

			doubleofValueList1.add(i * 2);

		}
		System.out.println(doubleofValueList1);

		System.out.println("========Getting Double value numbers of list with stream====");
		List<Integer> doubleofValueList2 = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(doubleofValueList2);	
		
		System.out.println("========set of double values==========");
		Set<Integer> setofDoubleValues = list.stream().map(i -> i * 2).collect(Collectors.toSet());
		System.out.println(setofDoubleValues);
		
		System.out.println("========Getting Double value numbers of list with stream lamda====");
		list.stream().map(x -> x*2).forEach(y -> System.out.println(y));

	}

}
