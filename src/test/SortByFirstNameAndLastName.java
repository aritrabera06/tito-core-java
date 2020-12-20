package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByFirstNameAndLastName {

	public static void main(String[] args) {
		/*
		 * {"sachin R tendulkar", "Rahul K dravid","Ajay J Jadeja" , "Virat M Kozhi",
		 * "ishanth s Sharma"}
		 */

		List<NameBean> names = new ArrayList<NameBean>();

		names.add(new NameBean("sachin", "R", "tendulkar"));
		names.add(new NameBean("Rahul", "K", "dravid"));
		names.add(new NameBean("Ajay", "J", "Jadeja"));
		names.add(new NameBean("Virat", "M", "Kozhi"));

		System.out.println("Name Sorting by First Name:");
		Collections.sort(names, NameBean.firstNameComparator);

		for (NameBean nm : names) {
			System.out.println(nm);
		}

		System.out.println("Name Sorting by Last Name:");
		Collections.sort(names, NameBean.lastNameComparator);

		for (NameBean nm : names) {
			System.out.println(nm);
		}
	}
}

class NameBean {
	String fName;
	String mName;
	String lName;

	public NameBean(String fName, String mName, String lName) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public static Comparator<NameBean> firstNameComparator = new Comparator<NameBean>() {

		@Override
		public int compare(NameBean n1, NameBean n2) {
			String name1 = n1.getfName().toUpperCase();
			String name2 = n2.getfName().toUpperCase();

			// ascending order
			return name1.compareTo(name2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}

	};

	public static Comparator<NameBean> lastNameComparator = new Comparator<NameBean>() {

		@Override
		public int compare(NameBean n1, NameBean n2) {
			String name1 = n1.getlName().toUpperCase();
			String name2 = n2.getlName().toUpperCase();

			// ascending order
			return name1.compareTo(name2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}

	};

	public String toString() {
		return "[ fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
}
