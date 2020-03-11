package javatutorial.class5to6;

import java.util.Arrays;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 10:15:35 AM
* 
* a demo to show using 2D arrays
* 
*/
public class MultiDimArrayDemo {

	public static void main(String[] args) {
		// This is a simple 2D arrays
   	 int[][] ns = {
   	            { 1, 2, 3, 4, 6 },
   	            { 5, 6, 7, 8 },
   	            { 9, 10, 11, 12 }
   	        };
   	 
   	// This is a simple 2D arrays
       String[][] names = {
           {"Mr. ", "Mrs. ", "Ms. "},
           {"Smith", "Jones"}
       };
       
       String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };
       
       // Mr. Smith
       System.out.println(names[0][0] + names[1][0]);
       // Ms. Jones
       System.out.println(names[0][2] + names[1][1]);
       
       // declare arrays
       int[][] ticketInfo;

       // create arrays
       ticketInfo = new int [2][3];
       
       // initialize the array elements
       ticketInfo[0][0] = 15;
       ticketInfo[0][1] = 10;
       ticketInfo[0][2] = 15;
       ticketInfo[1][0] = 25;
       ticketInfo[1][1] = 20;
       ticketInfo[1][2] = 25;

      System.out.println(Arrays.deepToString(ticketInfo));

	}

}
