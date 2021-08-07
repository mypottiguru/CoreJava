package ThreadClass;

public class Shared {
	synchronized void test1() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
