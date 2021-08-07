package ThreadClass;

public class ThreadMethods {

	public static void main(String[] args) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		Thread1 thread1 = new Thread1();
		thread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		Thread2 thread2 = new Thread2();
		Thread t2 = new Thread(thread2);
		t2.start();
	}

}
