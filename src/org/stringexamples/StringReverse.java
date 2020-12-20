package org.stringexamples;

public class StringReverse {

	public static void main(String[] args) {
		String str = "KAUSHIK";
		
		System.out.print(" reverse of " + str + " is : ");
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.print(sb.toString());
		System.out.println();
		
		// 2nd approach
		str = "TITO";
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(" reverse of " + str + " is : " + sb1.reverse());
		
		// 3rd approach
		String input = "GeeksForGeeks"; 
        // convert String to character array by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
        
        // 4th approach
        String string = "abcdef";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
	}
}
