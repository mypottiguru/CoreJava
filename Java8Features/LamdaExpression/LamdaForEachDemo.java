package Java8Features.LamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LamdaForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Java");

		System.out.println(list);
		
		for(String str: list) {
			System.out.println(str);
		}
		
		list.forEach(x -> System.out.println(x));
	}

}
