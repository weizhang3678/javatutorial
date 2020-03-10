package javatutorial.workshop;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Mar 5, 2020 5:15:35 PM
 * 
 * A workshop problem
 * 
 */
public class ArtichokeProblem {
	
	private static int p;
	private static int a;
	private static int b;
	private static int c;
	private static int d;
	
	/**
	 * precondition
	 * 
	 * @param n (1 ≤ n ≤ 1000000) 
	 * 
	 * postcondition: price(k) = p · (sin(a · k + b) +
	 *          cos(c · k + d) + 2)
	 */
	public static double price(int n) {
		return p * (2 + Math.sin(a * n + b) + Math.cos(c * n + d));
	}

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
	 * postcondition: 
	 * call price(int n)
	 */
	public static double price(int p, int a, int b, int c, int d, int n) {
		ArtichokeProblem.a = a;
		ArtichokeProblem.b = b;
		ArtichokeProblem.c = c;
		ArtichokeProblem.d = d;
		ArtichokeProblem.p = p;
		return price(n);
	}
	
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
	 * postcondition: 
	 */
	public static  double maximumDecline(int p, int a, int b, int c, int d, int n) {
		ArtichokeProblem.a = a;
		ArtichokeProblem.b = b;
		ArtichokeProblem.c = c;
		ArtichokeProblem.d = d;
		ArtichokeProblem.p = p;
		double maxDecline = 0.00;
		for(int i =1; i<= n;i++) {
			for(int j=i+1; j<=n;j++) {
				if(price(i) < price(j)) {
					break;
				}else {
					double decline = price(i) - price(j);
					if(decline > maxDecline) {
						maxDecline = decline;
					}
				}
			}
		}
		
		return maxDecline;
	}

	public static void main(String[] args) {
		
		// sample input 1:
		System.out.println(maximumDecline(42, 1, 23, 4, 8, 10));
		
		// sample input 2:
		System.out.println(maximumDecline(100, 7, 615, 998, 801, 3));
				
		// sample input 3:
		System.out.println(maximumDecline(100, 432, 406, 867, 60, 1000));

	}

}
