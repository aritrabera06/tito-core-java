package org.kroger_java_quitz;

import java.util.Arrays;
import java.util.HashMap;

/*
 *  Q : where the output lines 'double 1', 'double 2' and  'double 3' will be printed
 *  Ans: o/p will be : 
 *  			Stream 	without terminal operation
				With terminal operation on stream
				double 1
				double 2
				double 3
 */
public class Output_Streams {

	public static void main(String[] args) {
		System.out.println("Stream 	without terminal operation");
		Arrays.stream(new int[]{1,2,3}).map(i -> {
			System.out.println("double " + i);
			return i * 2;
		});
		
		System.out.println("With terminal operation on stream");
		Arrays.stream(new int[]{1,2,3}).map(i -> {
			System.out.println("double " + i);
			return i * 2;
		}).sum();
	}
} // End of class Output_Streams
