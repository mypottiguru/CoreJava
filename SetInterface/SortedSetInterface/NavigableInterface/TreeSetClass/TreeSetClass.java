package SetInterface.SortedSetInterface.NavigableInterface.TreeSetClass;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(3);
		System.out.println(set);
		
		set.add(1);
		System.out.println(set);
		
		//set.add(null);
		//System.out.println(set);//java.lang.NullPointerException
	}

}
