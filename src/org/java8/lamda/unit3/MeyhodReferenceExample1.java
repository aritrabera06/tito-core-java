package org.java8.lamda.unit3;

public class MeyhodReferenceExample1 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				printMessage();
			}
		});
		t.start();
		
		// lambda way
		Thread t1 = new Thread(() -> printMessage());
		t1.start();
		
		//using Method Reference
		Thread t2 = new Thread(MeyhodReferenceExample1::printMessage); 
		// 'MeyhodReferenceExample1::printMessage' is same as '() -> printMessage()'
		// we can say as an alternative syntax.
		t2.start();
	}
	
	
	public static void printMessage() {
		System.out.println("Hello...");
	}
}
