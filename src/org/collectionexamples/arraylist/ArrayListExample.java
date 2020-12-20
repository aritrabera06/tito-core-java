package org.collectionexamples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		List lstArryLstObj = new ArrayList();
		
		lstArryLstObj.add(1);
		lstArryLstObj.add(200);
		//lstArryLstObj.add(null);
		lstArryLstObj.add(-10);
		lstArryLstObj.add(" ");
		//lstArryLstObj.add(null);
		lstArryLstObj.add(200);
		
		System.out.println(lstArryLstObj);
		
		//Iterate the ArrayList using Iterator
		Iterator itr = lstArryLstObj.iterator();
		System.out.println("Iterating the ArrayList...");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " , ");
		}
		System.out.println("");
		System.out.println("Sort The ArrayList . . . ");
		Collections.sort(lstArryLstObj);  // if list has null elements, it gives NullPointerException
		System.out.println("Sorted List : " + lstArryLstObj);
		
		// Remove dups from ArrayList by converting it into a Set
		Set set = new LinkedHashSet(lstArryLstObj);
		lstArryLstObj.clear();
		
		lstArryLstObj.addAll(set);
		System.out.println(lstArryLstObj);
		
	}
} // End of class ArrayListExample.java
