package org.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableObjectExample {
	
	private final int id;
	private final String name; 
	private final HashMap<String, String> testMap;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>)testMap.clone();
	}
	
	/**
	 * Constructor performing Deep Copy
	 * @param id
	 * @param name
	 * @param testMap
	 */
	public ImmutableObjectExample(int id, String name, HashMap<String, String> testMap) {
		System.out.println("Performing Deep Copy for Object initialization");
		
		this.id = id;
		this.name = name;
		
		HashMap<String, String> hm = new HashMap<String, String>();
		String key;
		Iterator<String> itr = testMap.keySet().iterator(); 
		while(itr.hasNext()) {
			key = itr.next();
			hm.put(key, testMap.get(key));
		}
		this.testMap =  hm;
	}

	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	
	/*public ImmutableObjectExample(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}*/
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		int i=10;
		
		ImmutableObjectExample immObj = new ImmutableObjectExample(i,s,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s ==  immObj.getName());
		System.out.println(h1 == immObj.getTestMap());
		
		//print the immObj values
		System.out.println("immObj id     :" + immObj.getId());
		System.out.println("immObj name   :" + immObj.getName());
		System.out.println("immObj testMap:" + immObj.getTestMap());
		
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		
		//print the values again
		System.out.println("immObj id after local variable change     :" + immObj.getId());
		System.out.println("immObj name after local variable change   :" + immObj.getName());
		System.out.println("immObj testMap after local variable change:" + immObj.getTestMap());
		System.out.println("h1 :" + h1);
		
		HashMap<String, String> hmTest = immObj.getTestMap();
		hmTest.put("4", "new");
		System.out.println("hmTest :" + hmTest);
		System.out.println("immObj testMap after changing variable from accessor methods:"+immObj.getTestMap());
		
	} // End of main()
	
}// ImmutableObjectExample
