package ThreadClass;

public class ThreadAnnanamusClass {

	public static void main(String[] args) {
		System.out.println("start main method");
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Thread run method");
			}
		};
		t1.start();
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Runnable run method");
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();
		
		System.out.println("end main method");
	}

}
