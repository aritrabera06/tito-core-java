package org.java8.lamda.unit1;

public class Greeter {

	public void greeter() {
		System.out.println("Hello World... from greeter()");
	}
	
	public void greeter(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greeter();
		
		/*
		 * This classic OOP, polymorphism and action write here.
		 */
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greeter(helloWorldGreeting);
		
		// to have a data type of these LHS variables, we have to create an interface.
		// the interface should have a method of the same signature as the one used in the lambda exp.
		MyLambda mylamddaFunction = () -> System.out.println("Hello World... from lambda expression...");
		mylamddaFunction.foo();
		
		MyAddLambda myLamdaAdd = (int a, int b) -> a + b; 
		System.out.println(myLamdaAdd.foo(10, 20));
		
		// we can even use our Greeting interface.
		Greeting mylamddaFunction1 = () -> System.out.println("Hello World... from lambda expression...Greeting interface");
		
		
		// Lambdas vs Interfaces 
		Greeting helloWorldGreeting1 = new HelloWorldGreeting();
		Greeting lamddaGreeting = () -> System.out.println("Hello World... from lambda expression...");
		
		/*
		 *  what is the difference between these above statements ?
		 *  helloWorldGreeting1 is using an implementation of a class, where as
		 *  lamddaGreeting is an lambda expression
		 */
		
		helloWorldGreeting1.perform();
		lamddaGreeting.perform();  // both of these will give same output
		
		
		// anonymous inner class
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World... from innerClassGreeting...");
			}
		};
		innerClassGreeting.perform();
	}

} // End of class Greeter

interface MyLambda {
	public void foo();
}
interface MyAddLambda {
	public int foo(int a, int b);
}
