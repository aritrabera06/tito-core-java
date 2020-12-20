package org.java8.lamda.unit3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.java8.lamda.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewes","Carol", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mathew","Arnorld", 39)
			);
		
		// Different ways to iterate the list : these are called EXTERNAL INTERATORS : telling the compiler we want
		// to iterate the list, we are controlling it.
		System.out.println("Using for loop :");
		for (int i = 0; i < people.size(); i++) { // this loop is sequential
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop :"); // this loop is sequential
		for(Person p : people) {
			System.out.println(p);
		}
	
		System.out.println("Using iterator :");
		for (Iterator<Person> iterator = people.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person);
		}
		
		System.out.println("Using lambda for each loop :");
		// the parameter of forEach() is a Consumer interface
		people.forEach(p -> System.out.println(p)); // this loop is NOT sequential, we do not care about the order
		// this can further be modified with a method reference
		people.forEach(System.out::println);
	}
}
