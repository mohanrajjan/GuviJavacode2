package org.guvitask;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the age in integer");
		int Age = sc.nextInt();
		try {
		if(Age<18) {
			throw new InvalidAgeException("Age should not be less than 18");
		}
		}
		catch(InvalidAgeException e)
		{
       System.out.println("Not allowed" +e);
	}
		System.out.println("Customer Age is" +Age);
	}
}
