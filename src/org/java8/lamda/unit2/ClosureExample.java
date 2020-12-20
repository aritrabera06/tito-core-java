package org.java8.lamda.unit2;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20; // as per java 8, b is considered effectively final
		
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				//b= 40;  // this gives a compiler error : 'Local variable b defined in an enclosing scope must be final or effectively final'
				// b is considered effective final.
				// till java 7 , we would have to declare b as final.	
				
				System.out.println(i + b); // here the process() is executed in doProcess(), but still the 
				// compiler processes b, as it keep tracks of the same.
			}
		});
		
		// now instead of creating an anonymous inner class , if we create a lambda , same thing would happen.
		doProcess(a, i -> System.out.println(i + b));
		// here b is considered frozen and this is the concept of closure. now where b is coming from in the above lambda expression, b is coming from closure.
		// whenever there is variable in the scope, which is effectively final, can be passed with the lamdba expression. The java run time freezes the value.
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	interface Process {
		void process(int i);
	}
}
