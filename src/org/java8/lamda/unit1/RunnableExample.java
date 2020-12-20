package org.java8.lamda.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {   // anonymous inner class

			@Override
			public void run() {
				System.out.println("Printed inside Runnable...");
			}
			
		});
		
		myThread.run();
		
	   // this is a classic case where we can use a lambda
	   Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside lambda Runnable..."));
	   myLambdaThread.run();
	   //myLambdaThread.start();
	}
} // End of class RunnableExample
