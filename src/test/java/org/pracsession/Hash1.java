package org.pracsession;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hash1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash = new HashMap<Integer,String>();
		hash.put(1,"Apple");
		hash.put(3,"Mango");
		hash.put(4,"JackFruit");
		hash.put(2,"CustardAplle");
		hash.putIfAbsent(5,"Peer");
		HashMap<Integer,String> p2= new HashMap<Integer, String>();
		p2.put(6,"Orange");
		p2.putAll(hash);
		for (Map.Entry<Integer,String> pr1:p2.entrySet()) {
		System.out.println(pr1.getKey()+" "+ pr1.getValue());	
		}
	}
}
