package org.stringexamples;

import java.util.HashMap;

public class AnagramStrings {
	/**
	 * 
	 * An anagram of a string is another string that contains the same characters,
	 * only the order of characters can be different. 
	 * 
	 * Logic : put all the characters
	 * of the strings in two HashMaps, and if the maps are equal, they are anagram.
	 */
	public static void main(String[] args) {
		// Get the Strings
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		// Test the Strings
		checkAnagram(str1, str2);

		// Get the Strings
		str1 = "geeksforgeeks";
		str2 = "geeks";

		// Test the Strings
		checkAnagram(str1, str2);
	}

	private static void checkAnagram(String str1, String str2) {
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++) {
			if (hmap1.get(str1.charAt(i)) == null) {
				hmap1.put(str1.charAt(i), 1);
			} else {
				hmap1.put(str1.charAt(i), hmap1.get(str1.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			if (hmap2.get(str2.charAt(i)) == null) {
				hmap2.put(str2.charAt(i), 1);
			} else {
				hmap2.put(str2.charAt(i), hmap2.get(str2.charAt(i)) + 1);
			}
		}
		
		if(hmap1.equals(hmap2)) {
			System.out.println(str1 + " and " + str2 + " are anagram.");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT anagram.");
		}
	}
}
