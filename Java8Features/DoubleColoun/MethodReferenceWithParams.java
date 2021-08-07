package Java8Features.DoubleColoun;

@FunctionalInterface
interface Interface1{
	void myMethod();
}
@FunctionalInterface
interface Interface2{
	void myMethod(String str);
}
@FunctionalInterface
interface Interface3{
	Integer myMethod(Integer a);
}

class ClassA{
	void test1() {
		System.out.println("test1 with void return and 0 arguments");
	}
}
class ClassB{
	void test2(String str) {
		System.out.println("test2 with void return and 1 argument:"+str);
	}
}
class ClassC{
	Integer test3(Integer a) {
		System.out.println("test3 with Integer return and 1 argument");
		return a*a;
	}
}
public class MethodReferenceWithParams {

	public static void main(String[] args) {
		Interface1 i1 = new ClassA()::test1;
		i1.myMethod();
		
		Interface2 i2 = new ClassB()::test2;
		i2.myMethod("Hello");
		
		Interface3 i3 = new ClassC()::test3;
		System.out.println(i3.myMethod(10));
		
		

	}

}
