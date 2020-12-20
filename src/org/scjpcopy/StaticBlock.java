package org.scjpcopy;

class ClassWithStaticBlock {
	static int i = 100;
	static {
		System.out.println("It's a static block... see the magic ");
		//System.exit(0); // 0 means error less exit.
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println(ClassWithStaticBlock.i);
	}
}
