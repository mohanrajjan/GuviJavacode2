package org.guvitask;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task7Employee {

	public static void main(String[] args) {
		TreeMap<String, Integer> tr = new TreeMap<String, Integer>();
		tr.put("Mani", 101);
		tr.put("Ezhil", 107 );
		tr.put("Paneer",109 );
		Set<Entry<String, Integer>> s = tr.entrySet();
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry.getKey());
			
		}

	}

}
