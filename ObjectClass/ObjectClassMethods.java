package ObjectClass;

public class ObjectClassMethods {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.i = 20;
		a1.j = 20.00;
		
		System.out.println(a1);
		System.out.println(a1.hashCode());
		
		A a2 = new A();
		a2.i = 20;
		a2.j = 20.00;
		
		System.out.println(a2);
		System.out.println(a2.hashCode());
		
		System.out.println(a1.equals(a2));
		

	}

}
