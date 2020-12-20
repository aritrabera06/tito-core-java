package org.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			//fis = new FileInputStream("c://TestSerialization.txt");
			fis = new FileInputStream("c://TestSerialization.ser");
			ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			Student studentObj = (Student) obj;

			System.out.println("Name : " + studentObj.name + " , Roll : " + studentObj.roll + " , academicYear : " + Student.academicYear);

		} catch (Exception ex) {
			System.out.println("Exception occured...");
			ex.printStackTrace();
		} finally {
			try {
				if (null != ois) {
					ois.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (null != fis) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
} // End of class ReadObject
