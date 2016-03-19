import java.net.*;
import java.io.*;
import java.util.concurrent.*;

public class MultiRequestClient implements Runnable {
	public static void main(String[] args) throws IOException {
		int request_num = 1000000;
		produceMultiRequests(request_num);
	}

	public static void produceMultiRequests(int request_num) {
		for (int i = 0; i < request_num; i++) {
			produceRequest(i);
		}
	}

	public static void produceRequest(int i) {
		Runnable multiRequestClient = new MultiRequestClient();
		Thread thread = new Thread(multiRequestClient);
		thread.setName("Thread-" + i);
		thread.start();
	}

	@Override
	public void run() {
		long threadId = Thread.currentThread().getId();
		String threadName = Thread.currentThread().getName();
		System.out.println("I am thread " + threadName);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}
		System.out.println("I will be dead " + threadName);
	}
}