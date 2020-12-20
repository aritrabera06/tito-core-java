package org.java8.lamda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.java8.lamda.unit1.Person;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewes","Carol", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mathew","Arnorld", 39)
			);
		
		  // Step 1 : sort by last name
			/*Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getLastName().compareTo(p2.lastName);
				}
			});*/
		
			//Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.lastName));
			// We can even omit the data 'Person' in the lambda expression parameter, because the compiler figures it out.
			Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		 // Step 2 : Create a method that prints all elements in the list
			System.out.println("****************** List of people after sorting ***********************");
			//System.out.println(Arrays.asList(people));
			
			printPeopleConditionally(people, p -> true);
			
		
		 // Step 3 : Create a method that prints all the people with last name starting with C
			
         // all done, but this is a bad approach. If we have to filter by some other thing, we have to write another method.
		 // we can have object with the filer to pass, to make it generic.
			System.out.println("****************** List of people with last name starting with C ***********************");
			/*printPeopleConditionally(people, new Condition() {
				@Override
				public boolean test(Person p) {
					return p.getLastName().startsWith("C");
				}
			});*/
			
			printPeopleConditionally(people, p -> p.getLastName().startsWith("C"));
			
			System.out.println("****************** List of people with first name starting with C ***********************");
			/*printPeopleConditionally(people, new Condition() {
				@Override
				public boolean test(Person p) {
					return p.getFirstName().startsWith("C");
				}
			});*/
			
			printPeopleConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	/*private static void printPeopleConditionally(List<Person> people , Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}*/
	
	private static void printPeopleConditionally(List<Person> people , Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
} // End of class Unit1ExerciseJava7

