package javatutorial.class5to6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 29, 2020 10:06:34 AM
 * 
 */

public class Reverse {
	public static void main(String[] args) {
		// switch array element
		int[] values = { 60, 2, 1, 7, 12, 5, 29};
		int count = values.length / 2;
        for(int i = 0; i< count ;i++) {
        	int tmp = 0;
        	tmp = values[i]; 
        	values[i] = values[values.length-1-i];
        	values[values.length-1-i] = tmp;
        }
		System.out.println("Reversed array is: " + Arrays.toString(values));
		
		// create a new array to save 
		values = new int[] { 60, 2, 1, 7, 12, 5, 29};
		int[] newArr = new int[values.length];
		for(int i = 0 ; i< values.length; i++) {
			newArr[i] = values[values.length-1-i];
		}
		System.out.println("Reversed array is: " + Arrays.toString(newArr));
		
		
		// Collections.reverse()
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i <values.length; i++) {
            arraylist.add(values[i]); 
        }
        Collections.reverse(arraylist); 
     
        for (int i = 0; i < values.length; i++) {
        	values[i] = (int) arraylist.get(i);
        }
        System.out.println("Reversed array is: " + Arrays.toString(values));
	}

}
