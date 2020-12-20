package org.scjpcopy.equalhashcode;

public class Student {
	private String regNo;

	public Student(String rNo) {
		this.regNo = rNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public boolean equals(Object o) {
		System.out.println("Form equals() method ...");
		if(o != null && o instanceof Student) {
			String regNo = ((Student)o).getRegNo();
			if(regNo != null && regNo.equals(this.regNo)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		System.out.println("Form hashCode() method ...");
		return this.regNo.hashCode();
	}
}
