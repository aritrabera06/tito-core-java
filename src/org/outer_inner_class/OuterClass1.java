package org.outer_inner_class;

public class OuterClass1 { // outer class cannot be static

	int i = 100;
	/** 
	 *  Inner class can be:
	 *  i) static(nested)
	 *  ii)Non-static(inner) 
	 */
	class Inner  // non-static inner class
	{
		int j = 200;
		public void test()
		{
			System.out.println("i of outer from inner class :" + i); // outer class variables are accessible to inner class
			System.out.println("j of inner class from inner class method:" + j);
		}
	}// End of inner class Inner
	
	public void test1()
	{
		System.out.println("i of outer from inner class :" + i);
		//System.out.println("j of inner class from outer class method:" + j); // inner class j cannot be accessible by outer class method
		
		Inner innerClassObj = new Inner();  
		System.out.println("accessing inner variable by inner class object : " + innerClassObj.j);
		innerClassObj.test(); // accessing inner method by inner class object
	}
	
	public static void main(String[] args) {
		// System.out.println(i);  // cannot access non-static member from static method
		OuterClass1 outerClass1Obj = new OuterClass1();
		System.out.println("outerClass1Obj.i : " + outerClass1Obj.i);
		
		// Inner innerClassObj = new Inner(); // since Inner is non-static member
		
		Inner innerClassObj = outerClass1Obj.new Inner(); // creating an instance of inner class using the outer class instance.
		System.out.println(innerClassObj.j);
		innerClassObj.test();
	} 

} // End of class OuterClass1
