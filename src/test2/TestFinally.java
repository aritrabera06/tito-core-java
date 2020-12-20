package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//import static java.lang.Math;
//import static java.lang.Integer;
import static java.lang.Math.abs; // valid static import

public class TestFinally implements Cloneable{
	 
	public void disp() {
		//public int i;
		final int j = 10;
	}

	public static void main(String[] args) {
		try {
			int a = 4;
			int b = 0;
			//System.out.println(a/b);	
			//List<Object> myList = new ArrayList<String>();  // CE
		}catch(Exception e) {
			return;
		}finally {
			System.out.println("Finally Executed...");
		}
		
		Collection myCollection = new ArrayList();
		//Collection myCollection1 = new Object();  // CE
	}
	
	/* The field str cannot be declared static in a non-static inner type, unless initialized with a constant expression
	 * */
	 
	private  class A { // inner class can be final also, and anonyous
		int a;
		final static String str = "STRING_IN_A";
	}
	public class B extends A{
		final static String str = "STRING_IN_B";
	}
	
} // End of class TestFinally

interface I1 {
	// modifier for the interface method doTask; only public, private, abstract, default, static 
	// and strictfp are permitted
	//static  void doTask();
}
interface I2 extends I1{
	
}


