package org.kroger_java_quitz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 *  Q : what is the output from running main
 *  Note : LinkedList implements the Queue interface. 
 *  
 *  Ans: characters will be printed in reverse order.
 */

public class PrettyPrint1 {
	
	public void doAction(Queue q) {
		if(q.isEmpty()) return;
		
		Object first = q.remove();
		doAction(q);
		System.out.println(first.toString());
	}
	
	public static void main(String[] args) {
		LinkedList<String> starterList = new LinkedList(Arrays.asList("A","B","C","D","E")); 
		PrettyPrint1 pp = new PrettyPrint1();
		pp.doAction(starterList);
	}
}
