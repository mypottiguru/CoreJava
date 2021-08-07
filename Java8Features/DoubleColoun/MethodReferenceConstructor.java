package Java8Features.DoubleColoun;

@FunctionalInterface
interface userInterface {
	User getUser(String str);
}

class User {
	String myName;

	User(String name) {
		this.myName = name;
	}
}

public class MethodReferenceConstructor {

	public static void main(String[] args) {
		userInterface uInterface = User::new;
		User obj = uInterface.getUser("Sreenivas");
		System.out.println(obj.myName);
	}

}
