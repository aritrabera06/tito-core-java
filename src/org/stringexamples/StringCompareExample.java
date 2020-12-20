package org.stringexamples;

public class StringCompareExample {
	public static void main(String tito[]) {
		String s1 = "Tito";
		System.out.println(s1.compareTo("ABCD"));
		System.out.println(s1.compareTo("Tito"));
		System.out.println(s1.compareToIgnoreCase("tITO"));
		
		System.out.println(s1.equals("Tito"));
		System.out.println(s1.equals("TitO"));
		System.out.println(s1.equalsIgnoreCase("Tito"));
		
		
		String s2 = "abcd45";
		System.out.println("Character.isDigit(s2.charAt(4)) : " + Character.isDigit(s2.charAt(4))) ;
	}
}
