package org.collectionexamples.arraylist;

import java.util.Comparator;

public class Student {
	private String studentName;
	private int rollNo;
	private int studentAge;

	public Student(int rollno, String studentname, int studentage) {
		//super();
		this.rollNo = rollno;
		this.studentName = studentname;
		this.studentAge = studentage;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	/* Comparator for sorting the list by Student Name */
	public static Comparator<Student> studentNmComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getStudentName().toUpperCase();
			String StudentName2 = s2.getStudentName().toUpperCase();

			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}

	};

	/* Comparator for sorting the list by roll no */
	public static Comparator<Student> studentRollNoComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			int rollno1 = s1.getRollNo();
			int rollno2 = s2.getRollNo();

			/* For ascending order */
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
	}

} // End of class
