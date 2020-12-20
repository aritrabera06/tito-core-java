package org.java8.lamda.unit1;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		StringLengthLambda mylambda = (String s) -> s.length();
		System.out.println(mylambda.getLength("Hello Lambda"));
		
		// we can also get rid of the data type in the argument of the lambda expression, beacuse the compiler already
		// knows the type by mapping it from the interface it binds to.
		StringLengthLambda mylambda2 = ( s) -> s.length();
		System.out.println(mylambda2.getLength("Hello Lambda 2"));
		
		// also if we have only one argument, then we do not have to even put the paranthesis
		StringLengthLambda mylambda3 = s -> s.length();
		System.out.println(mylambda3.getLength("Hello Lambda 3"));
		
		// we can put [s -> s.length()] as a method argument. See below.
		printLambda( s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda 4"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
} // End of class TypeInterfaceExample
