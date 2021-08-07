package ThreadClass;

public class Thread2 implements Runnable{
	
	public void run() {
		for(int i=200;i<=210;i++) {
			System.out.println(i);
		}
	}

}
