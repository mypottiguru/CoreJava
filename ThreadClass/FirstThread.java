package ThreadClass;

public class FirstThread extends Thread{
private Shared shared;
	
	public FirstThread(Shared shared){
		this.shared = shared;
	}
	public void run() {
		shared.test1();
	}
}
