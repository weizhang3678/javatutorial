package javatutorial.class1to2;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Mar 5, 2020 5:15:35 PM
 * 
 * a simple demo to show how to do mathematics in Java
 * 
 */
public class ArtichokeProblem {

	/**
	 * precondition
	 * 
	 * @param p (1 ≤ p ≤ 1000)
	 * @param a (0 ≤ a ≤ 1000)
	 * @param b (0 ≤ b ≤ 1000)
	 * @param c (0 ≤ c ≤ 1000)
	 * @param d (0 ≤ d ≤ 1000)
	 * @param n (1 ≤ n ≤ 1000000) 
	 * 
	 * postcondition: price(k) = p · (sin(a · k + b) +
	 *          cos(c · k + d) + 2)
	 */
	public static double price(int p, int a, int b, int c, int d, int n) {
		return p * (2 + Math.sin(a * n + b) + Math.cos(c * n + d));
	}

	public static void main(String[] args) {
		

		System.out.println(price(42, 1, 23, 4, 8, 10));
		

	}

}
