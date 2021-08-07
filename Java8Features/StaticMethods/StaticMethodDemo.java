package Java8Features.StaticMethods;

interface StaticInterface {
	static void test() {
		System.out.println("static method for DefaultInterface1");
	}
}

class MyClass implements StaticInterface {
	static void test() {
		System.out.println("test method for MyClass");
		StaticInterface.test();
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		StaticInterface.test();

		MyClass c1 = new MyClass();
		c1.test();
	}
}
