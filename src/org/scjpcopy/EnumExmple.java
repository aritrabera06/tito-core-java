package org.scjpcopy;

public class EnumExmple {

	public static void main(String[] args) {
		Month m;
		m = Month.Jan;
		System.out.println(m);
		System.out.println(Month.Jan);
		
		int i = m.get();
		System.out.println(i);
	}
}

// enum with constructor
enum Month{
	Jan(31),Feb(28),Mar(31);
	int i;
	Month(int i){ // sine Jan(<int>) has int argument, we have to declare the Month() constructor
		this.i = i;
	}
	public int get() {
		return i;
	}
}