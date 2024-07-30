package org.guvitask;


//By extending Exception current class will use all the features 
//from Exception class
public class InvalidAgeException extends Exception{
	//Creating constructor class for my custom exception then we use exception
	//using super class to print exception message
	//By using argument type it will also print the message we provide there
public InvalidAgeException(String msg) {
	super(msg);
}

	public static void main(String[] args) {
		
	}

}
