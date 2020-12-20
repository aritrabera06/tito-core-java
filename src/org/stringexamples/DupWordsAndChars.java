package org.stringexamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DupWordsAndChars {
	public static void main(String[] args) {
		checkDupWords("I am am practicing java java programs");
		checkDupCharacters("kaushik");
	}
	
	private static void checkDupCharacters(String theWord) {
		if(null == theWord || theWord.length() < 1) {
			return;
		}
		char ch;
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		// iterate over the string get each char and put in HashMap - key = char, value = count
		for(int i=0; i < theWord.length(); i++ ) {
			ch = theWord.charAt(i);
			if(charMap.get(ch) == null) {
				charMap.put(ch, 1);
			}else {
				charMap.put(ch, charMap.get(ch)+1);
			}
		}
		System.out.println(charMap);
		Iterator<Character> itr = charMap.keySet().iterator();
		while(itr.hasNext()) {
			ch = itr.next();
			if(charMap.get(ch) > 1) {
				System.out.println(ch + " occured " + charMap.get(ch));
			}
		}
	}

	public static void checkDupWords(String str) {
		if(str == null || str.length() < 1) {
			return;
		}
		
		// split the string in an array by space
		String s[] = str.split(" ");
		System.out.println(Arrays.toString(s));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String tmpStr : s) {
			if(map.get(tmpStr) == null) {
				map.put(tmpStr, 1);
			}else {
				map.put(tmpStr, map.get(tmpStr)+1);
			}
		}
		System.out.println(map);
		
		Iterator<String> itr = map.keySet().iterator();
		String tmpStr;
		while(itr.hasNext()) {
			tmpStr = itr.next().toString();
			if(map.get(tmpStr) > 1) {
				System.out.println("'" + tmpStr + "'" + " occured " + map.get(tmpStr));
			}
		}
	}
} // End of class
