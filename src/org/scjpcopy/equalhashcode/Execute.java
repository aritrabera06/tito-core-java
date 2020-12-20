package org.scjpcopy.equalhashcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


// https://www.youtube.com/watch?v=ghswNpRv2t0 , https://www.youtube.com/watch?v=7V3589CReug
public class Execute {

	public static void main(String[] args) {
		Student s1 = new Student("H1234");
		Student s2 = new Student("H1234");
		
		System.out.println(s1.equals(s2)); // even though the values are same, they are different objects and have diff memory addr.
		
		Map<Student, ReportCard> studentReport = new HashMap<Student, ReportCard>();
		
		studentReport.put(s1, new ReportCard());
		studentReport.put(s2, new ReportCard());
		
		System.out.println(studentReport.size());
		
		// Now if the equals method is overridden, 
		
		// to iterate the map -  java 7 way
		/*Set<Student> set = studentReport.keySet();
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println( itr.next().getRegNo() );
		}*/
		
		// to iterate the map -  java 8 way
		//studentReport.forEach((key, value) -> System.out.println(key.getRegNo(), value.getMathScore()) );
		/*studentReport.entrySet()
		             .stream()
		             .forEach();*/
	}
}
