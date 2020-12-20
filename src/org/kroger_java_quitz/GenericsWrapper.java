package org.kroger_java_quitz;

/*
 *  Q : What will be the output
 *  Ans : 	ParentA-5
			BaseA-1
 */
class BaseA {
	private String instanceId;

	public BaseA(String instanceId) {
		this.instanceId = instanceId;
	}

	public void printInstanceName() {
		System.out.println(this.instanceId);
	}
}

class ParentA extends BaseA {
	public ParentA(String instanceId) {
		super(instanceId);
	}
}

public class GenericsWrapper {
	static public <T extends BaseA> void printGenerics(T instance) {
		instance.printInstanceName();
	}

	public static void main(String[] args) {
		BaseA baseA = new BaseA("BaseA-1");
		ParentA parentA = new ParentA("ParentA-5");

		printGenerics(parentA);
		printGenerics(baseA);
	}
}
