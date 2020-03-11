package javatutorial.class3to4;

import java.util.Arrays;
import java.util.Scanner;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 9:15:35 AM
* 
* a game
* 
*/

public class BigOrSmall {

	public static void main(String[] args) {
		System.out.println("************************* game introduction ************************");
		System.out.println("*");
		System.out.println("*Computer will toss 3 dices，if sum of marks >= 10 the result is big，otherwise, the result is small*");
		System.out.println("*");
		System.out.println("********************************************************************");
		System.out.println("start a game? y(yes) or n(no)?");
		Scanner scanner = new Scanner(System.in);
		String result = scanner.nextLine();
		while(result.equals("y")) {
			
			int sum = 0;
			int[] dices = new int[3];
			int times = 0;
			while(times < 3) {
				dices[times] = (int)(Math.random()*7);
				sum = sum + dices[times];
				times++;
			}
			System.out.println("Please input big OR small : ");
			result = scanner.nextLine();
			if((sum>=10 && result.equals("big")) || (sum<10 && result.equals("small"))) {
				System.out.println("successful！");
			}else {
				System.out.println("fail! The valus are " + Arrays.toString(dices) );
			}
			System.out.println("continue this game? y(yes) or n(no)?");
			result = scanner.nextLine();
		}
	}
}
