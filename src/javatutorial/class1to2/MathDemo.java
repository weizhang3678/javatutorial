package javatutorial.class1to2;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 21, 2020 7:01:01 PM
 * 
 */

public class MathDemo {

	public static void main(String[] args) {
		//
		double e = Math.E;
		double pi = Math.PI;
		

		System.out.println("Math.sqrt(16) is "+Math.sqrt(16));//4.0
        System.out.println("Math.cbrt(8) is "+Math.cbrt(8));//2.0
 
        /**
         * Math.pow(a,b) =  a raised to the power of b
         * */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.pow(3,2) is "+Math.pow(3,2));//9.0
 
        /**
         * Math.max()
         * Math.min()
         * */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.max(2.3,4.5) is "+Math.max(2.3,4.5));//4.5
        System.out.println("Math.min(2.3,4.5) is "+Math.min(2.3,4.5));//2.3
 
        /**
         * Math.abs = abstract value
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.abs(-10.4) is "+Math.abs(-10.4));//10.4
        System.out.println("Math.abs(10.1) is "+Math.abs(10.1));//10.1
 
        /**
         * Math.ceil
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.ceil(-10.1) is "+Math.ceil(-10.1));//-10.0
        System.out.println("Math.ceil(10.7) is "+Math.ceil(10.7));//11.0
        System.out.println("Math.ceil(-0.7) is "+Math.ceil(-0.7));//-0.0
        System.out.println("Math.ceil(0.0) is "+Math.ceil(0.0));//0.0
        System.out.println("Math.ceil(-0.0) is "+Math.ceil(-0.0));//-0.0
        System.out.println("Math.ceil(-1.7) is "+Math.ceil(-1.7));//-1.0
 
        /**
         * Math.floor
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.floor(-10.1) is "+Math.floor(-10.1));//-11.0
        System.out.println("Math.floor(10.7) is "+Math.floor(10.7));//10.0
        System.out.println("Math.floor(-0.7) is "+Math.floor(-0.7));//-1.0
        System.out.println("Math.floor(0.0) is "+Math.floor(0.0));//0.0
        System.out.println("Math.floor(-0.0) is "+Math.floor(-0.0));//-0.0
 
        /**
         * Math.random return a random value belongs to [0,1)
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.random() is "+Math.random());//[0,1)
        System.out.println("Math.random()*100 is "+Math.random()*100);//[0,100)
 
        /**
         * Math.rint round value
         * return double
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.rint(10.1) is "+Math.rint(10.1));//10.0
        System.out.println("Math.rint(10.5) is "+Math.rint(10.5));
        System.out.println("Math.rint(9.5) is "+Math.rint(9.5));
        System.out.println("Math.rint(9) is "+Math.rint(9));
        System.out.println("Math.rint(-10.5) is "+Math.rint(-10.5));//-10.0
        System.out.println("Math.rint(-10.51) is "+Math.rint(-10.51));//-11.0
        System.out.println("Math.rint(-10.2) is "+Math.rint(-10.2));//-10.0
        System.out.println("Math.rint(2.5/0) is "+Math.rint(2.5/0));
        System.out.println("Math.rint(-2.5/0) is "+Math.rint(-2.5/0));
        System.out.println("Math.rint(NaN) is "+Math.rint(Double.NaN));
 
 
        /**
         * Math.round 
         * return int or long, depends on type of argument
         */
 
        System.out.println("------------------------------------------");
        System.out.println("Math.round(10.1) is "+Math.round(10.1));//10
        System.out.println("Math.round(10.5) is "+Math.round(10.5));
        System.out.println("Math.round(9.5) is "+Math.round(9.5));
        System.out.println("Math.round(-10.5) is "+Math.round(-10.5));//-10
        System.out.println("Math.round(-10.51) is "+Math.round(-10.51));//-11
        System.out.println("Math.round(-10.2) is "+Math.round(-10.2));//-10
        System.out.println("Math.round(9) is "+Math.round(9));//9
        System.out.println("Math.round(2.5/0) is "+Math.round(2.5/0));
        System.out.println("Math.round(-2.5/0) is "+Math.round(-2.5/0));
        System.out.println("Math.round(NaN) is "+Math.round(Double.NaN));//9.0

	}

}
