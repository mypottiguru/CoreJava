package StringClass;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(6));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('l', 'L'));
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('d'));
		System.out.println(str.substring(1));
		System.out.println(str.substring(0, 5));// 5th will not consider

		String s1 = " Hello ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());

	}

}
