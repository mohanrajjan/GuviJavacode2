package org.guvitask;

import java.util.Scanner;

public class Task7 {
public void OutOfArray() {
	int a[]= new int[3];
	a[0]=5;
	a[1]=8;
	a[2]=3;
	a[3]=8;
	//Array index will print values upto a[2]
	// more than that if we give it throw Array index OutofBound exceptions
	System.out.println(a[3]);
}
public void OutOfWord() {
	String s="Mohan";
	char char1 = s.charAt(4);
	System.out.println(char1);
	//s contains only 5 character, Here index starts with 0 ends with 4 
	//we give more than 5 it will throw String OutofBound Exception
	char char2 = s.charAt(5);
	
	System.out.println(char2);
}
	public static void main(String[] args) {
		Task7 tt= new Task7();
		//tt.OutOfArray();
		//tt.OutOfWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("provide integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//using try & catch we can handle exceptions
		try {
		int c= a/b;
		}
		//we know it will throw Airthmetic exception so inside catch we gave
		// to handle exception
		catch(ArithmeticException e) {
			//getmessage() used to display the error message to users
		System.out.println(e.getMessage());
		}
		System.out.println("Error displayed above");
	}

}
