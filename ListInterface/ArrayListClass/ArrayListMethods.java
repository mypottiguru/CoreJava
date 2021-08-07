package ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("three");
		list.add("two");
		list.add("four");
		System.out.println(list);
		System.out.println("size:"+list.size());
		
		List<String> list2 = new ArrayList<>();
		list2.add("five");
		list2.add("seven");
		list2.add("six");
		
		list.addAll(list2);
		
		list.remove(1);
		
		System.out.println("After remove :"+list);
		
		String id = list.get(1);
		System.out.println("id is:"+id);		
		
		System.out.println("After adding list2:"+list);
		
		list.add(1, "eight");
		System.out.println("after adding 1st index:"+list);
		
		boolean isContain = list.contains("one");
		System.out.println("isContain:"+isContain);
		
		int index1 = list.indexOf("one");
		System.out.println("one index:"+index1);
		
		int listSize = list.size();
		System.out.println(listSize);
		
		list.clear();
		System.out.println("After clear:"+list);
	}

}
