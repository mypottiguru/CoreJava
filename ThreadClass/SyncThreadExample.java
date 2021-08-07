package ThreadClass;

public class SyncThreadExample {

	public static void main(String[] args) {
		Shared s = new Shared();
		FirstThread th1 = new FirstThread(s);
		SecondThread th2 = new SecondThread(s);
		
		th1.start();
		th2.start();
	}

}
