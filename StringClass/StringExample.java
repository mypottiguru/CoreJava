package StringClass;

public class StringExample {

	public static void main(String[] args) {
		String str1 = new String("Sreeni");// Heap memory
		String str2 = new String("Sreeni");// Heap memory
		String str3 = str1;// Heap memory
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println("----------------");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println("=================");

		String s1 = "Sreeni";// String pool
		String s2 = "Sreeni";// String pool
		String s3 = s1;// String pool
		String ja = "ja";// String pool
		String va = "va";// String pool
		String java = "java";// String pool
		String java1 = ja + va;// Heap memory
		String java2 = "ja" + "va";// String pool
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("----------------");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(java == java1);
		System.out.println(java == java2);
		System.out.println("=================");
	}

}
