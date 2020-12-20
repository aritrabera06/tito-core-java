package org.collectionexamples.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// Since List is an interface, it;s instance can only be created as : 
		
		List lstArryLstObj = new ArrayList();
		List lstLnkLstObj = new LinkedList();
		List lstVctrObj = new Vector(); 
		List lstStckObj = new Stack(); 
		
		Employee emp = new Employee(102,"Ravi");
		
		lstArryLstObj.add(1);
		lstArryLstObj.add(200);
		lstArryLstObj.add(null);
		lstArryLstObj.add(-10);
		lstArryLstObj.add(" ");
		lstArryLstObj.add(null);
		lstArryLstObj.add(200);
		
		System.out.println(lstArryLstObj);
		
	}
}
