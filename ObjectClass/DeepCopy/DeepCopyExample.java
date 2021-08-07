package ObjectClass.DeepCopy;

public class DeepCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		CompanyAddress ca = new CompanyAddress("Hyd", 123);
		Company com1 = new Company(1, "Sreeni", ca);

		Company com2 = (Company) com1.clone();

		System.out.println(com1);
		System.out.println(com2);

		com2.getAddress().setCity("Bangalore");
		System.out.println(com1);
		System.out.println(com2);
		
		System.out.println("Shallow become Deep");
		
		Tester t1 = new Tester(1, "Sreeni");
		Tester t2=(Tester)t1.clone();
		
		System.out.println(t1);
		System.out.println(t2);
		
		t2.setName("Lakshmi");
		
		System.out.println(t1);
		System.out.println(t2);

	}

}
