package org.kroger_java_quitz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Q : What will be output of the program
 * Ans : Greeks
 *       GeeksForQuitz
 */
public class LamndaExample {

	public static void main(String[] args) {
		List<String> listStrings = Arrays.asList("Greeks", "QA","GeeksForQuitz","goo","bar");
		
		Predicate<String> p = (s) -> s.startsWith("G");
		
		for(String st : listStrings) {
			if(p.test(st))
				System.out.println(st);
		}
	}
}
