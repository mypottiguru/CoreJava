package Interview;

class Hello1{
	/*void test(String str) {
		System.out.println("str:"+str);
	}*/
	void test(Integer i) {
		System.out.println("i:"+i);
	}
	void test(Object o) {
		System.out.println("o:"+o);
	}
}
public class NullDemo {

	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		h1.test(null);

	}

}
