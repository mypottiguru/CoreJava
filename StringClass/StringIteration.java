package StringClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringIteration {

	public static void main(String[] args) {
		String st1 = "Sreeni;Rama;Krishna";
		System.out.println("st1:" + st1);

		String stArray[] = st1.split(";");

		for (String s : stArray) {
			System.out.println(s);
		}
		System.out.println("=================");
		String student = "Siva Rama Raaju";
		String reverse = "";
		for (int i = student.length() - 1; i >= 0; i--) {

			reverse = reverse + student.charAt(i);
		}
		System.out.println("reverse:" + reverse);
		System.out.println("=================");

		String input = "Geeks For Geeks";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();

		for (char c : hello)
			trial1.add(c);

		Collections.reverse(trial1);
		ListIterator<Character> li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());

	}
}