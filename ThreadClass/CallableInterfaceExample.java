package ThreadClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallabe implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

}

public class CallableInterfaceExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Callable<String> cal = new MyCallabe();
		List<Future<String>> fList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Future<String> future = executor.submit(cal);
			fList.add(future);
		}
		for (Future<String> fut : fList) {
			try {
				System.out.println(fut.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
