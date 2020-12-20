package org.collectionexamples.arraylist;

public class Employee implements Comparable {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Object emp) {
		int compareId = ((Employee) emp).getId();

		/* For Ascending order */
		return this.id - compareId;
		
		/* For Descending order do like this */
        //return compareId-this.id;
	}

	public String toString() {
		return "[ id =" + this.id + ", name=" + this.name + "]";
	}

}
