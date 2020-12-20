package org.scjpcopy;

class Pet
{
	private String name;
	private int weight;
	
	public Pet(String n, int w) {
		name = n;
		weight= w;
	}
	public void getDetails() {
		System.out.println("Name:"+name+", Weight:"+weight);
	}
	public void setName(String n) {
		name=n;
	}
} // End of class Pet

public class PassbyValueTest {

	public static void main(String[] args) {
		Pet pet = new Pet("Rabbit", 20);
		pet.getDetails();
		changeName(pet);
		pet.getDetails();
	}
	public static void changeName(Pet p)
	{
		//p.setName("Cow"); // o/p will Cow, same object has been updated.
		p = new Pet("Fox", 10); // this will change the original object copy of the object. So o/p will be Rabbit
	}
	
} // End of class PassbyValueTest
