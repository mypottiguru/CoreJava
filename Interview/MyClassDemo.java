package Interview;

class A1 {
	public void m1() {
		System.out.println(" A1 m1");
	}

}

class B1 extends A1 {
	public void m1() {
		System.out.println(" B1 m1");
	}

	public void m2() {
		System.out.println("B1 m2");
	}

}

public class MyClassDemo {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m1();
		System.out.println("====");
		A1 a2 = new B1();
		a2.m1();
		System.out.println("====");
		B1 b1 = new B1();
		b1.m1();
		b1.m2();

	}
}
