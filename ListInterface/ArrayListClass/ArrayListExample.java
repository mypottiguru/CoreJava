package ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(3);
		l1.add(2);
		
		System.out.println(l1);
		System.out.println("=========");
		l1.forEach(ele -> System.out.println(ele));

	}

}
