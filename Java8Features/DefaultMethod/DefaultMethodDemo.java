package Java8Features.DefaultMethod;

interface DefaultInterface1{
	default void test1() {
		System.out.println("Default method for DefaultInterface1");
	}
}
interface DefaultInterface2{
	default void test1() {
		System.out.println("Default method for DefaultInterface2");
	}
}
class Hello implements DefaultInterface1,DefaultInterface2 {
	@Override	
	public void test1() {
		DefaultInterface1.super.test1();
		DefaultInterface2.super.test1();
		//System.out.println("my own implementation");
	}
	
}
public class DefaultMethodDemo {
	public static void main(String[] args) {
		Hello h1 =new Hello();
		h1.test1();
		
		System.out.println("==========");
		DefaultInterface1 i1 = new Hello();
		i1.test1();
	}
}
