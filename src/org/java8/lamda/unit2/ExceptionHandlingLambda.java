package org.java8.lamda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		int someNumbers[] = {1,2,3,4,5};
		int key = 0;
		
		/*process(someNumbers, key, (v, k) -> {
			try {
				System.out.println(v / k);
			} catch (Exception e) {
				System.out.println("Exception occured...");
			}
			
		});*/
		
		//  this makes the main lambda expression nasty. So we will use a wrapper lambda
		
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)) );
		// this is one way of doing, it can be done in different other ways too.
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println("Exception caught occured wrapper method ...");
			}
		};
	}
	 
} // End of class ExceptionHandlingLambda
