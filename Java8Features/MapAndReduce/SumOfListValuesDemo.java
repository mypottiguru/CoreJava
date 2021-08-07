package Java8Features.MapAndReduce;

import java.util.Arrays;
import java.util.List;

public class SumOfListValuesDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		System.out.println("===Old way of getting sum values====");
		int sum = 0;
		for (int i : list) {
			sum = sum + i;
		}
		System.out.println("sum:" + sum);

		Integer sumFromMapWithMethodRefer = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sumFromMapWithMethodRefer:" + sumFromMapWithMethodRefer);

		Integer sumFromMapWithLamda = list.stream().mapToInt(i -> i).sum();
		System.out.println("sumFromMapWithLamda:" + sumFromMapWithLamda);
		
		System.out.println("=====using reduce method=====");

		Integer sumFromReduceWithLamda = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sumFromReduceWithLamda:" + sumFromReduceWithLamda);

		Integer sumFromReduceWithMethodRef = list.stream().reduce(Integer::sum).get();
		System.out.println("sumFromReduceWithMethodRef:" + sumFromReduceWithMethodRef);
	}
}
