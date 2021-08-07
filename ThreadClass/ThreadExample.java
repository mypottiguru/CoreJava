package ThreadClass;

public class ThreadExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main Thread");

		for (int i = 300; i <= 310; i++) {
			System.out.println(mainThread.getName() + ":" + i);
		}

		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);

		t1.start();
		t2.start();

	}

}
