package org.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	static String academicYear = "2019-20"; // static member does not serialize. In the reader class this value is read.
	// Not the value that has been set later either by constructor or by re-assigning the static member.(like in line 45 below)

	// transient String name; // transient variables will not be serialized and
	// transient int roll; // hence will not persist.

	String name;
	int roll;

	Student(String nm, int rl) {
		this.name = nm;
		this.roll = rl;
	}

	Student(String nm, int rl, String academicYear) {
		this.name = nm;
		this.roll = rl;
		Student.academicYear = academicYear;
	}
}

public class WriteObject {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			Student studentObj = new Student("Kaushik", 13);
			// Student studentObj = new Student("Kaushik", 13, "2021-22");
			// InputStreamReader in = new InputStreamReader(System.in);
			// BufferedReader br = new BufferedReader(in);

			//fos = new FileOutputStream("c://TestSerialization.txt");
			fos = new FileOutputStream("c://TestSerialization.ser");
			oos = new ObjectOutputStream(fos);

			Student.academicYear = "2020-21";
			System.out.println("Name : " + studentObj.name + " , Roll : " + studentObj.roll + " , academicYear : " + Student.academicYear);
			oos.writeObject(studentObj);

			System.out.println("File Created and serialized object written...");

		} catch (Exception ex) {
			System.out.println("Exception occured...");
			ex.printStackTrace();
		} finally {
			try {
				if (null != oos) {
					oos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (null != fos) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}// End of class WriteObject
