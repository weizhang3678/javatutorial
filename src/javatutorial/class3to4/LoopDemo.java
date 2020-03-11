package javatutorial.class3to4;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 10:15:35 AM
* 
* a demo to show using loops
* 
*/
public class LoopDemo {

	public static void main(String[] args) {
		// for loop
		for(int i = 0; i< 5; i++) {
			System.out.println("*****");
		}
		System.out.println("----SEPERATOR----");
		
		// while loop
		int index = 0;
		while(index<5) {
			System.out.println("*****");
			index++;
		}
		System.out.println("----SEPERATOR----");
		
		//nested for loop
		for(int i=0 ;i < 5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----SEPERATOR----");
		
		//nested while loop
		index = 0;
		while(index < 5) {
			int index1 = 0;
			while(index1 < 5) {
				System.out.print(index1);
				index1++;
			}
			System.out.println();
			index++;
		}
		System.out.println("----SEPERATOR----");
		
		//nested mixed loop
		for(int i=0 ;i < 5;i++) {
			index = 0;
			while(index<5) {
				System.out.print(index);
				index++;
			}
			System.out.println();
		}

		System.out.println("----SEPERATOR----");
	}

}
