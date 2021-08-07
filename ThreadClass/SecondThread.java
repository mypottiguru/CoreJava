package ThreadClass;

public class SecondThread extends Thread{
private Shared shared;
	
	public SecondThread(Shared shared){
		this.shared = shared;
	}
	public void run() {
		shared.test1();
	}
}
