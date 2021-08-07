package Java8Features.MapAndReduce;

import java.util.Arrays;
import java.util.List;

public class MultiplyListValuesDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20,30);
		Integer multiplyValue = list.stream().reduce(1, (a,b) -> a*b);
		System.out.println("multiplyValue:"+multiplyValue);
		

	}

}
