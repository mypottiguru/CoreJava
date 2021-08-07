package Java8Features.DoubleColoun;

@FunctionalInterface
interface SampleInterface{
	public void m1();
}
class A{	
	A(){
		System.out.println("Constructor method reference");
	}
	public void test1() {
		System.out.println("non static method reference");
	}
	public static void test2() {
		System.out.println("static method reference");
	}
}
public class DoubleColounExample {

	public static void main(String[] args) {
		SampleInterface i1 = A::new;
		i1.m1();
		
		SampleInterface i2 = new A()::test1;
		i2.m1();
		
		SampleInterface i3 = A::test2;
		i3.m1();
		
		
		
		
	}

}
