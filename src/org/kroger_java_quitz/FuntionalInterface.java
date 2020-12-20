package org.kroger_java_quitz;

import java.util.List;
/*
 *  Q : Is this a valid functional interface specification
 *  Ans : Functional Interfaces can only have one abstract method.
 *  After line 18 is commented, it becomes one. Can be verified using the @FunctionalInterface
 */
public class FuntionalInterface {

	public static void main(String[] args) {
		
	}
}

@FunctionalInterface
interface Hireable {
	List<String> getCompanies();
	//List<String> getColleges();
	
	default public int getRetirementAge() {
		return 65;
	}
	
	default public String getCountryOfResidence() {
		return "USA";
	}
}