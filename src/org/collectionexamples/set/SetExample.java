package org.collectionexamples.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> hash_Set = new HashSet<String>();
		
		hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set);  // un-ordered , no dups
        
        // Set demonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet");
        
        Set<String> treeSet = new TreeSet<String>(hash_Set);
        System.out.println(treeSet);
	}
} // End of class
