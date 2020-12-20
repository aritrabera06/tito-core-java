package org.ebay;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution2 {

	public static void main(String[] args) {

		ArrayList<String> stringsIn = new ArrayList<String>();
		ArrayList<String> stringsOut = new ArrayList<String>();

		// Complete the following test using Java and return your working code. Put your
		// code in only this file. Given a random alpha-numeric string with no special
		// characters, reformat the string without adding or removing any characters so
		// that no alphabet characters are adjacent to any other alphabet characters and
		// no numeric characters are adjacent to any other numeric characters, if
		// possible, and return the modified string. If it is not possible to reformat
		// the string in that way, then group all the alphabet characters at the
		// beginning of the string and all numeric characters at the end of the string.
		// In either case keep all alphabet characters in the same order relative to
		// each other before and after the formatting and also keep all numeric
		// characters in the same order releative to each other before and after the
		// formatting.

		// Example input1: "aabb12cc345"
		// Example output1: "a1a2b3b4c5c"
		// Example input2: "a1aa"
		// Example output2: "aaa1"

		stringsIn.add("aabb12cc345");
		stringsIn.add("a1aa");
		stringsIn.add("12z3g4dh");
		stringsIn.add("k1lm5678");
		stringsIn.add("aa11bb22");

		stringsOut.add("a1a2b3b4c5c");
		stringsOut.add("aaa1");
		stringsOut.add("z1g2d3h4");
		stringsOut.add("klm15678");
		stringsOut.add("a1a1b2b2");

		int numCorrect = 0;

		for (int i = 0; i < stringsIn.size(); i++) {
			String result = reformatString(stringsIn.get(i));
			if (result.equals(stringsOut.get(i))) {
				numCorrect++;
			}
		}

		System.out.println("Correct: " + numCorrect + " out of total: " + stringsIn.size());

		return;
	}

	private static String reformatString(String str) {
		// Add your implementation here
		int charCnt = 0;
		int numCnt = 0;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		StringBuffer patternSB = new StringBuffer();

		map.put(1, ""); // key=1 for char
		map.put(2, ""); // key=2 for nums
		System.out.println("input string   : " + str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				numCnt++;
				map.put(2, (new StringBuffer(map.get(2)).append(str.charAt(i)).toString()));
			} else if (Character.isAlphabetic(str.charAt(i))) {
				charCnt++;
				map.put(1, (new StringBuffer(map.get(1)).append(str.charAt(i)).toString()));
			}
		}

		System.out.println("charCnt  : " + charCnt);
		System.out.println("numCnt   : " + numCnt);

		if (charCnt == numCnt) {
			for (int i = 0; i < map.get(1).length(); i++) {
				patternSB.append(map.get(1).charAt(i));
				patternSB.append(map.get(2).charAt(i));
			}
		} else if ((numCnt + 1) == charCnt) {
			for (int indx = 0; indx < map.get(1).length(); indx++) {
				if (indx == map.get(1).length() - 1) {
					patternSB.append(map.get(1).charAt(indx));
				} else {
					patternSB.append(map.get(1).charAt(indx));
					patternSB.append(map.get(2).charAt(indx));
				}
			}
		} else {
			for (int indx = 0; indx < map.get(1).length(); indx++)
				patternSB.append(map.get(1).charAt(indx));
			for (int indx = 0; indx < map.get(2).length(); indx++)
				patternSB.append(map.get(2).charAt(indx));
		}

		System.out.println("patternSB   : " + patternSB.toString());
		System.out.println("===========================================");

		return patternSB.toString();
	}

}
