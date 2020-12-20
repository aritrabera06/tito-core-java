package org.thread;

class MultithreadingDemo implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

public class ThreadExampleByRunnable {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
