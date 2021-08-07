package Java8Features.LamdaExpression;

interface Calculation {
	int add(int a, int b);

}

public class LamdaWithParamDemo {

	public static void main(String[] args) {
		Calculation c1 = new Calculation() {

			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println(c1.add(10, 20));

		//Lamda Expression
		Calculation c2 = (a, b) -> a + b;
		System.out.println(c2.add(20, 30));
		
		// Creating Thread with Runnable
		Runnable runnable1 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}
		};

		Thread th1 = new Thread(runnable1);
		th1.start();
		
		//Creating Thread with Runnable Lamda Expression
		Runnable runnable2 = () -> System.out.println(Thread.currentThread().getName());
		Thread th2 = new Thread(runnable2);
		th2.start();

	}

}
