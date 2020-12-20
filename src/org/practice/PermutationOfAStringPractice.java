package org.practice;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfAStringPractice {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("Permutations of the string are : " + permutation(str));
	}

	private static Set<String> permutation(String str) {
		Set<String> perm = new HashSet<String>();
		if(str == null) {
			return null;
		} else if(str.length() == 0) {
			perm.add("");
			return perm;
		}
		
		char initial = str.charAt(0);
		String remStr = str.substring(1);
		Set<String> word = permutation(remStr);
		for(String strTmp : word) {
			for(int i=0; i<=strTmp.length(); i++) {
				perm.add(method(strTmp, initial,i));
			}
		}
		return perm;
	}

	private static String method(String strTmp, char initial, int i) {
		String begin = strTmp.substring(0,i);
		String end = strTmp.substring(i);		
		return begin + initial + end;
	}
}
