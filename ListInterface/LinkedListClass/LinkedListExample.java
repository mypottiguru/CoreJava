package ListInterface.LinkedListClass;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Sreenivas");
		linkedList.add("Raama");
		linkedList.add("Seeta");
		linkedList.add("Guru");
		System.out.println(linkedList);

		List<String> linkedList2 = new LinkedList<>();
		linkedList2.add("One");
		linkedList2.add("Three");
		linkedList2.add("Two");
		linkedList2.add("Four");

		linkedList.addAll(linkedList2);
		System.out.println(linkedList);

		linkedList.addFirst("Mohan");
		System.out.println("After addFirst:" + linkedList);

		linkedList.addLast("Kumar");
		System.out.println("After addingList:" + linkedList);

	}

}
