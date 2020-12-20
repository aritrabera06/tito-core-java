package org.scjpcopy;

public class ConstructorInSubClassesSuper {

	public static void main(String[] args) {
		B b = new B(10,20,30,40);
	}
}

class A {
	int i,j,k;
	A(){
		// if do not provide the default constructor - we will get CE
		//'Implicit super constructor A() is undefined. Must explicitly invoke another constructor 
	}
	public A(int i,int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
}
class B extends A {
	int l;
	public B(int i,int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}
}
