package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersDemo {

	public static void main(String[] args) {

		// 3,9,6,5,1
		// smallest: 13569
		// largest:96531
		List<Integer> maths = Arrays.asList(10000, 1000, 100, 10, 1);

		List<Integer> list = Arrays.asList(3, 9, 6, 5, 1);
		Collections.sort(list);
		System.out.println(list);
		Integer smallest = 0, biggest = 0;
		String str="",str1 = "";
		for (int i = 0; i < list.size(); i++) {
			str = str + list.get(i);
			smallest = smallest + list.get(i) * maths.get(i);
			System.out.println(str);
		}
		System.out.println("==========");
		System.out.println("smallest:" + smallest + "," + str);

		Collections.reverse(list);

		for (int j = 0; j < list.size(); j++) {
			str1 = str1 + list.get(j);
			biggest = biggest + list.get(j) * maths.get(j);
		}
		System.out.println("==========");
		System.out.println("bigggest:" + biggest+","+str1);

	}

}
