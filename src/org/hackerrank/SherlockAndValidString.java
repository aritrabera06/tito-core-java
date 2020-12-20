package org.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SherlockAndValidString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string : ");
		String str = br.readLine();
		
		System.out.println(isValid(str));
	}
	
	// this function only satisfies two test cases.
	/*static String isValid(String s) {
		String flag = "YES";
		int countOfAChar = 0;
		int noOfDeletes = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++) {
			if(noOfDeletes >1) {
				flag = "NO";
				break;
			}
			for(int j = i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					countOfAChar++;
					noOfDeletes++;
					if(countOfAChar > 2) {
						flag = "NO";
						break;
					}
				}
			}
			countOfAChar = 0;
		}
		if(flag == "YES") {
			char c;
			for(int i=0; i<s.length(); i++) {
				c = s.charAt(i);
				if(!sb.toString().contains(Character.toString(c))) {
					sb.append(c);
				}
			}
		}
		System.out.println(sb.toString());
		return flag;
    }*/
	
	//https://www.hackerrank.com/challenges/sherlock-and-valid-string/forum
	static String isValid(String s) {
		String flag = "YES";
		
	    int MAX_CHAR = 26;
		int n = s.length();
		if(n == 1) {
			return flag;
		}
		int[] charOccurance = new int[MAX_CHAR];
		
		// find the occurrence of individual characters.
		for (int i = 0; i < n; i++)
			charOccurance[s.charAt(i) - 'a']++;
		
		System.out.println(charOccurance.length);
		System.out.println(Arrays.toString(charOccurance));
		//int max
		
		return flag;
	}
}
