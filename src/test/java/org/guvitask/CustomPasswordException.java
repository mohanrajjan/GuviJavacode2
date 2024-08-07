package org.guvitask;

import java.util.Scanner;

public class CustomPasswordException {

	public static void main(String[] args) {
		//Using scanner class user can provide data
		Scanner sc = new Scanner(System.in);
		System.out.println("provide password here");
		//next() method is used to get string values from users
		String passwd = sc.next();
		try {
			if(!(passwd == "Mohan@123")) {
				//msg is provide as argument
				throw new WrongPassword("Password is wrong");
			}
		}
		//By using try and catch it handles the exception and Display the data
			catch(WrongPassword e)
			{
				System.out.println("Access denied " +e);
			}
		
		System.out.println("Entered Passwd is " +passwd);
	}

}
