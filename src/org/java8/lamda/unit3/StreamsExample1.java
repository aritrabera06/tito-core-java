package org.java8.lamda.unit3;

import java.util.Arrays;
import java.util.List;

import org.java8.lamda.unit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewes","Carol", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mathew","Arnorld", 39)
			);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
	    .forEach(p -> System.out.println(p.getFirstName()));
		
	   //Stream<Person> stream = people.stream();
	   
		 long count = people.stream()
		   .filter(p -> p.getLastName().startsWith("C"))
		   .count();
		 
		 System.out.println(count);
		 
		 people.parallelStream();
	}
}
