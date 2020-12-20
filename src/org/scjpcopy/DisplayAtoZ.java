package org.scjpcopy;

public class DisplayAtoZ {

	public static void main(String[] args) {
		try {
			char arr[] = new char[26];
			char ch = 'A';
			for(int i=0; i<26; i++) {
				arr[i]  = ch;
				ch++;
			}
			for(int i=0; i<26; i++) {
				System.out.print(arr[i] + " , ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
