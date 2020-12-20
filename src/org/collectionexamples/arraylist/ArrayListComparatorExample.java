package org.collectionexamples.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(101, "Zues", 26));
		arraylist.add(new Student(505, "Abey", 24));
		arraylist.add(new Student(809, "Vignesh", 32));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, Student.studentNmComparator);

		for (Student str : arraylist) {
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Student.studentRollNoComparator);
		for (Student str : arraylist) {
			System.out.println(str);
		}
	}
}
