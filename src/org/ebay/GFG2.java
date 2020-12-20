package org.ebay;

import java.util.TreeMap;

//https://practice.geeksforgeeks.org/problems/rearrange-characters/0
public class GFG2 {
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// int count = sc.nextInt();

		String str = "bbbaa";
		StringBuilder finalStr = new StringBuilder();
		int count = str.length();
		while (true) {
			if (count == 0)
				break;
			count--;
			// char ch[] = sc.next().toCharArray();
			char ch[] = str.toCharArray();
			int max = 1;
			TreeMap<Character, Integer> tr = new TreeMap<Character, Integer>();
			for (char c : ch) {
				if (!tr.containsKey(c)) {
					tr.put(c, 1);
				} else {
					int v = tr.get(c);
					v++;
					tr.put(c, v);
					if (v > max)
						max = v;
				}
			}
			System.out.println(tr.toString());
			
			int diff = ch.length - max;
			if (diff < max - 1) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}

		}
		System.out.println();
	}
	
	
	/*private static TreeMap<Character, Integer>  countOccurance(String str) {
		//String str = "bbbaa";
		//int count = str.length();
		//while (true) {
			//if (count == 0)
				//break;
			//count--;
			// char ch[] = sc.next().toCharArray();
			char ch[] = str.toCharArray();
			int max = 1;
			TreeMap<Character, Integer> tr = new TreeMap<Character, Integer>();
			for (char c : ch)
				if (!tr.containsKey(c)) {
					tr.put(c, 1);
				} else {
					int v = tr.get(c);
					v++;
					tr.put(c, v);
					if (v > max)
						max = v;
				}

			int diff = ch.length - max;
			if (diff < max - 1)
				System.out.println(0);
			else
				System.out.println(1);

		//}
		System.out.println(tr.toString());
		
		return tr;
	}*/
	
}
