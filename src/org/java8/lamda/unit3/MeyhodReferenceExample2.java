package org.java8.lamda.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.java8.lamda.unit1.Person;

public class MeyhodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewes","Carol", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mathew","Arnorld", 39)
			);
		
			System.out.println("****************** List of people after sorting ***********************");
			//performConditionally(people, p -> true, p -> System.out.println(p));
			performConditionally(people, p -> true, System.out::println);
		
	}

	private static void performConditionally(List<Person> people , Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
