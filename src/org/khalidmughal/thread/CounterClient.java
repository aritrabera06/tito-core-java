package org.khalidmughal.thread;

public class CounterClient {
	public static void main(String[] args) {
		Counter counterA = new Counter("Counter A");
		try {
			int val;
			do {
				val = counterA.getValue();
				System.out.println("Counter value read by main thread : " + val);
				Thread.sleep(1000);
			} while (val < 5);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted.");
		}
	}
}
