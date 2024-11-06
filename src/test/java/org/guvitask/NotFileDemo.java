package org.guvitask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NotFileDemo {

	public static void main(String[] args) {
		//using try & catch we can handle exception
		try {
			//demo file does not exist
			File src = new File("Utils\\Demo.xlsx");
			FileInputStream fis = new FileInputStream(src);
		}
		//in catch using Filenotfound exception we can handle the exception
		//and displays the reason in console to the users
catch(FileNotFoundException e){
	System.out.println("File does not exist " +e);
}
	}

}
