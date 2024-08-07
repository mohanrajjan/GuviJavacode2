package org.guvitask;
//By extending Exception current class will use all the features 
//from Exception class
public class WrongPassword extends Exception {
	//Creating constructor class for my custom exception then we use exception
		//using super keyword to print exception message
		//By using argument type it will also print the message we provide there
	public WrongPassword(String msg) {
		super(msg);
	}
}
