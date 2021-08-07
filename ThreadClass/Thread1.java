package ThreadClass;

public class Thread1 extends Thread{
	
		public void run() {
			for(int i=100;i<=110;i++) {
				System.out.println(getName()+":"+i);
			}
		}		

}
