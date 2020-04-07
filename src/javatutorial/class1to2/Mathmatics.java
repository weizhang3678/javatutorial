package javatutorial.class1to2;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 4, 2020 3:15:35 PM
* 
* a demo to illustrate overload
* 
*/
public class Mathmatics {

	
public static int sum(int a, int b) {
		
		return a + b;
		
	}

	
	public static void main(String[] args) {
		
		
		byte b1 = 127; // 0111 1111 + 1  = 1000 0000 //-0 -> -128, 0000 0000= +0
		
		int i1 = 10;
		int i2 = 3;
		System.out.println(i1/i2);// impossible to be a fraction number
		
			
		System.out.println((byte)(b1 +1));
		
		int num2 = 10; // int is type
		int num1 = 300;
		num1 = num1 +300;
		
		
		int s1 = sum( 300, 48475);
		
		
		System.out.println(sum(100,300));
		System.out.println(sum(400,300));
		
		
		double d1 = 127;
		

		int sum = num1 + num2; // +
		int substract = num1 - num2;// -
		int product = num1 * num2;// *
		int divide = num1 / num2;// /
		int modulor = num1 % num2;

		System.out.println(num1 + " and " + num2 + " sum = " + sum);

	}

	
}
