package org.ebay;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str = "aabb12cc345";
		System.out.println(Character.isDigit(str.charAt(0)));
		
		System.out.println("************************************************************");
		int[] count = new int[26];
		String str1 = "bbbaa";
		int n = str1.length();
		
		for (int i = 0; i < n; i++)
			count[str1.charAt(i) - 'a']++;
		
		System.out.println("str1.charAt(0) - 'a' : " + (str1.charAt(0) - '0'));
		System.out.println(Arrays.toString(count));
		System.out.println("************************************************************");
		
		
		String str2 = "Kaushik kumar das";
		System.out.println("str2.endsWith():  " + str2.endsWith(" "));
	}
}
