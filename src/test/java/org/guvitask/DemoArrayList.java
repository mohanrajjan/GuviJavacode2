package org.guvitask;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		//Inside generics we defining data type should be String
		ArrayList<String> ex = new ArrayList<String>();
		//Using add method we can add list of values using arraylist object
		ex.add("Mani");
		ex.add("Mohan");
		ex.add("Ezhil");
		ex.add("Dinesh");
		//printing the array list
		System.out.println(ex);
		//After using clear() method we can able to see values are removed
		ex.clear();
		System.out.println(ex);
	}

}
