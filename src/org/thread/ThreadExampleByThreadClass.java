package org.thread;

class MyThread extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			// System.out.println("Thread " + Thread.currentThread().getId() + " is running");
			for (int i = 10; i <= 15; i++) {
				System.out.println("i = " + i + " --> Thread " + Thread.currentThread().getId() + " is running");
			}
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

public class ThreadExampleByThreadClass {
	public static void main(String[] args) {
		MyThread myThread;
		for (int i = 1; i <= 5; i++) {
			myThread = new MyThread();
			myThread.start();
		}
	}
}
