package test2;

public class StaticInheritance {

	public static void main(String[] args) {
		System.out.println(A.str);
		System.out.println(B.str);
		//System.out.println(new B().str);
	}
}

class A
{
	static String str = "String in A";
}

//@Override
class B extends A
{
	
	static String str = "String in B";
	//String str = "String in B";
}