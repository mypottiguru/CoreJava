package ListInterface.LinkedListClass;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> frouts = new LinkedList<>();
		frouts.add("Mango");
		frouts.add("Apple");
		frouts.add("Guva");
		frouts.add("Grapes");
		frouts.add("Banana");
		
		System.out.println(frouts);
		
		frouts.addFirst("Lemon");
		System.out.println("After addFirst"+frouts);
		
		frouts.addLast("Watermelon");
		System.out.println("After addList:"+frouts);
		
		String getByIndex = frouts.get(1);
		System.out.println("getByIndex:"+getByIndex);
		
		String getFirst = frouts.getFirst();
		System.out.println("getFirst:"+getFirst);
		
		String getLast = frouts.getLast();
		System.out.println("getLast:"+getLast);
		
		String peekFirst = frouts.peekFirst();
		System.out.println("peekFirst:"+peekFirst);
		
		String peekLast = frouts.peekLast();
		System.out.println("peekLast:"+peekLast);
	}

}
