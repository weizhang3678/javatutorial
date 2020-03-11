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
public class PrintDemo {

	public static void print1() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i -1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void print4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void print5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i + 1; j++) {
				System.out.print(i+1);
			}
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void print6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i + 1; j++) {
				if (i >= j) {
					System.out.print(i-j + 1);
				}else {
					System.out.print(j-i + 1);
				}
			}
			for (int j = 0; j < (9 - 2*i -1)/2 ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print6();

	}

}
