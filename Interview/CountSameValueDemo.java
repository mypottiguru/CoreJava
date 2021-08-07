package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountSameValueDemo {

	public static void main(String[] args) {

		List<Integer> duplicateList = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4);

		System.out.println("duplicate list:" + duplicateList);
		List<Integer> distinctList = duplicateList.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctList:" + distinctList);
		for (Integer i : distinctList) {
			Long count = duplicateList.stream().filter(j -> j.equals(i)).count();
			System.out.println(i + " count:" + count);
		}

	}

}
