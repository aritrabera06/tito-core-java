package org.java8.lamda.unit2;

import org.java8.lamda.unit2.ClosureExample.Process;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i-> {
			System.out.println("Value of i : " + i);
			System.out.println(this); // this 'this' will point to the instance of the object on which the execute() called. 
		});
	}
	
	public static void main(String[] args) {
		//System.out.println(this); // this will compiler error - 'Cannot use this in a static context'
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {
			public void process(int i) {
				System.out.println("Value of i : " + i);
				System.out.println(this); // 'this' - will refer to the anonymous inner class 
			}
			
			public String toString() {
				return "This is the anonymous inner class...";
			}
		});
		
		// now if we do this using a lambda expression :
		
		thisReferenceExample.doProcess(10, i-> {
			System.out.println("Value of i : " + i);
			//System.out.println(this);  // Compilation error : 'Cannot use this in a static context'
			// this is because lambdas treat this slightly different way than a anonymous inner class. It does not refer to the like anonylous inner class.
			// this is intentional and by design. 'this' is same as the one line 12 above.
			// the lambda did not override the this like the anonymous inner class.
		});
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is the ThisReferenceExample class...";
	}
}
