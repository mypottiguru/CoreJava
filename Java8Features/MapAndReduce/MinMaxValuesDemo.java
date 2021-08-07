package Java8Features.MapAndReduce;

import java.util.Arrays;
import java.util.List;

public class MinMaxValuesDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		System.out.println("==========max===========");

		Integer max1 = list.stream().reduce((a, b) -> a > b ? a : b).get();
		System.out.println("max:" + max1);

		Integer max2 = list.stream().reduce(Integer::max).get();
		System.out.println("max:" + max2);

		System.out.println("==========min===========");

		Integer min1 = list.stream().reduce((a, b) -> a < b ? a : b).get();
		System.out.println("min:" + min1);

		Integer min2 = list.stream().reduce(Integer::min).get();
		System.out.println("min:" + min2);
		
		System.out.println("=====min and max from stream method====");
		
		Integer max3 = list.stream().max((a, b) -> a.compareTo(b)).get();
		System.out.println("max:" + max3);

		Integer min3 = list.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("min:" + min3);
	}
}
