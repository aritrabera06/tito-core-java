package org.kroger_java_quitz;

import java.util.HashMap;

/*
 *  Q : What will be the output of the code will be ?
 *  Ans : 
 */
class Key {
	String keyValue;

	public Key(String keyValue) {
		this.keyValue = keyValue;
	}
}

public class HashMapScenarios {

	public static void main(String[] args) {
		/* string key ops */
		HashMap<String,Integer> stringKeyHashMap = new HashMap<String,Integer>();
		stringKeyHashMap.put("A", Integer.valueOf(1));
		stringKeyHashMap.put("A", Integer.valueOf(2));
		
		/* custom key operation */
		HashMap<Key,Integer> customKeyHashMap = new HashMap<Key,Integer>();
		Key key1A = new Key("A");
		Key key2A = new Key("A");
		
		customKeyHashMap.put(key1A, Integer.valueOf(1));
		customKeyHashMap.put(key2A, Integer.valueOf(2));
		
		System.out.println(stringKeyHashMap.size() + " , " + customKeyHashMap.size());
		
		System.out.println(String.format("stringKey : %s; customKey : %s", stringKeyHashMap.get("A"), 
				customKeyHashMap.get(key1A)));
		
	}
}
