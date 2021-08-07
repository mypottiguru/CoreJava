package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithALetterList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();		
		list.add("Kumar");
		list.add("Adhya");
		list.add("Rama");
		list.add("Akhil");
		
		List<String> StartWithALetterList = list.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
		System.out.println(StartWithALetterList);
	}

}
