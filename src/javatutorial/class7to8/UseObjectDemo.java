package javatutorial.class7to8;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 10:55:35 AM
* 
* a demo to show use classes and objects
* 
*/
public class UseObjectDemo {

	public static void main(String[] args) {
		Person san = new Person("Zhang", "zhang@gmail.com", "3065559999", 38);
		san.work("cleaning");
		
		Person mary = new Person("Mary", "mary@gmail.com", "3065093678", 18);
		mary.study("math");

	}

}
