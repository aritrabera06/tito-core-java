package org.java8.lamda.unit1;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World... from greeting interface...");
	}

}
