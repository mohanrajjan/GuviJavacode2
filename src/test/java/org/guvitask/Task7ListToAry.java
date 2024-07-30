package org.guvitask;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task7ListToAry {

	public static void main(String[] args) {
		//s is a list of array
		String[] s= {"cola","Soda","Limca"};
		//inside linked list we adding arrays and converting it to list
		List<String> l= new LinkedList(Arrays.asList(s));
		l.add("Miranda");
		l.add("MountainDew");
		System.out.println(l);
		//using toArray method we converting list to array again
	  Object[] array = l.toArray();
	  //using enhanced for loop we printing the arrays values
		for (Object ob : array) {
			System.out.println(ob);
		}
		
		}

}
