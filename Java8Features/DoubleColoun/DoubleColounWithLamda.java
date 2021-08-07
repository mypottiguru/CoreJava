package Java8Features.DoubleColoun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class MM {

	public void testMethodReference(String str) {
		System.out.println(str);
	}

	public static void testStaticMethodReference(String str) {
		System.out.println(str);
	}
}

public class DoubleColounWithLamda {

	public static void main(String[] args) {
		System.out.println("======non static======");
		Stream<String> s1 = Stream.of("one", "two", "three");
		s1.forEach(new MM()::testMethodReference);

		System.out.println("======static========");
		Stream<String> s2 = Stream.of("first", "second", "third");
		s2.forEach(MM::testStaticMethodReference);
		
		System.out.println("======max value with functional reference and reduce method========");
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer maxVal = list.stream().reduce(Integer::max).get();
		System.out.println("max:"+maxVal);
		
		
	}

}
