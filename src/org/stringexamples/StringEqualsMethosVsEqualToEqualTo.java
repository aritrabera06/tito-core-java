package org.stringexamples;

public class StringEqualsMethosVsEqualToEqualTo {

	public static void main(String[] args) {
		String s1 = "Tito";
		String s2 = "Tito";
		String s3 = new String("Tit0");
		
		System.out.println("s1==s2        : " + (s1==s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));	
		System.out.println("s1==s3        : " + (s1==s3));
		System.out.println("s1.equals(s2) : " + s1.equals(s3));	
		
		
		System.out.println("Address of s1 : " + Integer.toHexString(s1.hashCode()));
		System.out.println("Address of s2 : " + Integer.toHexString(s2.hashCode()));
		System.out.println("Address of s3 : " + Integer.toHexString(s3.hashCode()));
	}
}
