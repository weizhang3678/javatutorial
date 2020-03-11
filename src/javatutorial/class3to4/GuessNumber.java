package javatutorial.class3to4;

import java.util.Scanner;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 3:15:35 AM
* 
* a game to guess number of Robot
* 
*/
public class GuessNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = (int)(Math.random()*100);
		System.out.println("Hi, I am a robot and I have a secret!\n" + 
				"It is a number between 1 to 99. I will give you 6 tries.");
        int guess = -1;
        int times = 0;
		while(times < 6 && guess != number) {
        	System.out.println("What is your guess?");
        	guess = scanner.nextInt();
        	if(guess > number) {
        		System.out.println("Too Hign!");
        	} else if(guess < number) {
        		System.out.println("Too Low!");
        	}
        }
		if(guess == number) {
			System.out.println("You got it! Found my secret!!");
		}else {
			System.out.println("no more guess! Better luck next time.");
			System.out.println("The secret number was " + number);
		}
	}

}
