package javatutorial.class1to2;

import java.util.Scanner;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 4, 2020 7:15:35 AM
* 
* second Java demo
* 
*/
public class SayHello {

	public static void main(String[] args) {
	
		System.out.println("What is your name?");
		   
	    Scanner getName = new Scanner(System.in);

	    String userName = getName.nextLine();

	    System.out.println("Hello " + userName +"!");
	    
	    getName.close();

	}

}
