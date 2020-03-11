package javatutorial.class5to6;

import java.util.Random;
/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 11:15:35 AM
* 
* a practice
* 
*/
public class ArraySum {
	
	public static int[] generateArray(int size) {
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = new Random().nextInt(10);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = generateArray(10);
		// TODO 

	}

}
