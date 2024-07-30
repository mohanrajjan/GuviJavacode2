package org.guvitask;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task7Employee {

	public static void main(String[] args) {
		TreeMap<Integer, String> tr = new TreeMap<Integer, String>();
		tr.put(101, "Mani");
		tr.put(107, "Ezhil");
		tr.put(105, "Paneer");
		Set<Entry<Integer, String>> s = tr.entrySet();
		for (Entry<Integer, String> entry : s) {
			System.out.println(entry.getValue());
			
		}

	}

}
