package org.collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The singletonList(T) method is used to return an immutable list containing only the specified object.
 * 
 * Signature : public static <T> List<T> singletonList(T o)
 */

public class CollectionsSingletonListDemo {

	public static void main(String[] args) {
		// create an array objects
		String init[] = {"One", "Two", "Three", "One", "Two", "Three"};
		
		// create one List
		List list = new ArrayList<String>(Arrays.asList(init));
		
		System.out.println("List before : " + list);
		
		// create a singleton list
		list = Collections.singletonList("Tito");
		
		System.out.println("List after : " + list);
	}
}
