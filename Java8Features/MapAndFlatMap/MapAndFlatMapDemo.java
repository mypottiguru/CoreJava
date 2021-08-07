package Java8Features.MapAndFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "Kumar", "kumar@gmail.com", Arrays.asList("93797979797", "7777777777")));
		list.add(new Customer(2, "Ravi", "ravi@gmail.com", Arrays.asList("5353535", "7373474")));
		list.add(new Customer(3, "Rama", "rama@gmail.com", Arrays.asList("23532", "5325325")));
		list.add(new Customer(4, "Seeta", "seeta@gmail.com", Arrays.asList("8797979797", "668")));
		list.add(new Customer(5, "Sreeni", "sreeni@gmail.com", Arrays.asList("865865", "464643")));

		List<List<String>> mailList = list.stream().map(customer -> customer.getPhoneNumber())
				.collect(Collectors.toList());
		System.out.println(mailList);
		System.out.println("==========");

		List<String> phoneList = list.stream().flatMap(customer -> customer.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println(phoneList);
		System.out.println("=========");

		List<String> phoneList1 = list.stream().flatMap(customer -> customer.getPhoneNumber().stream())
				.filter(phone -> phone.startsWith("9")).collect(Collectors.toList());
		System.out.println(phoneList1);
		System.out.println("==========");

		Optional<String> p = list.stream().map(customer -> customer.getPhoneNumber().stream())
				.flatMap(stream -> stream.filter(phone -> phone.startsWith("9"))).findAny();

		p.ifPresent(System.out::println);
	}

}
