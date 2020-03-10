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
public class Asteroids {

	/**
	 * all the distance of all the points
	 * 
	 * @param axis1
	 * @param axis2
	 * @return
	 */
	public static double distanceAll(double[] axis1, double[] axis2) {
		double distance = 0.0;
		for (int i = 0; i < axis1.length; i = i + 2) {
			for (int j = 0; j < axis2.length; j = j + 2) {
				double newDistance = Math
						.sqrt(Math.pow((axis1[i] - axis2[j]), 2) + Math.pow((axis1[i + 1] - axis2[j + 1]), 2));
				distance += newDistance;
			}
		}
		return distance;

	}

	public static double distanceCenter(double[] axis1, double[] axis2) {	
		double sumx1 = 0;
		double sumy1 = 0;
		for (int i = 0; i < axis1.length; i++) {
			if (i % 2 == 0) {
				sumx1 = sumx1 + axis1[i];
			} else {
				sumy1 = sumy1 + axis1[i];
			}
		}
		double x1 = sumx1*2/axis1.length;
		double y1 = sumy1*2/axis1.length;
		
		double sumx2 = 0;
		double sumy2 = 0;
		for (int j = 0; j < axis2.length; j ++) {
			if (j % 2 == 0) {
				sumx2 = sumx2 + axis2[j];
			} else {
				sumy2 = sumy2 + axis2[j];
			}
		}
		double x2 = sumx2*2/axis2.length;
		double y2 = sumy2*2/axis2.length;
		return Math
				.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

	}

	public static double[] axis(double[] old, double time, int vx, int vy) {
		double[] newAxis = new double[old.length];
		for (int i = 0; i < old.length; i++) {
			if (i % 2 == 0) {
				newAxis[i] = old[i] + time * vx;
			} else {
				newAxis[i] = old[i] + time * vy;
			}

		}
		return newAxis;
	}

	/**
	 * 
	 * @param param1: form n x1 y1 x2 y2 . . . xn yn vx vy n>=3
	 * @param param2: form n x1 y1 x2 y2 . . . xn yn vx vy n>=3 each xi, yi (−10 000
	 *                ≤ xi, yi ≤ 10 000) vx, vy (−100 ≤vx, vy ≤ 100)
	 * @return
	 */
	public static String timeToOverlap(int[] param1, int[] param2) {
		// number of sides
		int n1 = param1[0];
		int n2 = param2[0];
		double[] axis1 = new double[2 * n1];
		double[] axis2 = new double[2 * n2];
		for (int i = 0; i < axis1.length; i++) {
			axis1[i] = param1[i + 1];
		}

		for (int i = 0; i < axis2.length; i++) {
			axis2[i] = param2[i + 1];
		}

		// speed of polygons
		int vx1 = param1[param1.length - 2];
		int vy1 = param1[param1.length - 1];
		int vx2 = param2[param2.length - 2];
		int vy2 = param2[param2.length - 1];

		// current distance
		double distance = 0.0;
		double time = 0.0;
		double newDistance = 0.0;
		while (time == 0.0 || newDistance < distance) {
			distance = distanceCenter(axis1, axis2);
			time = time + 0.0001;
			axis1 = axis(axis1, 0.0001, vx1, vy1);
			axis2 = axis(axis2, 0.0001, vx2, vy2);
			newDistance = distanceCenter(axis1, axis2);
		}

		if (time == 0.0001)
			return "never";
		else
			return "" + (time - 0.0001);
	}

	public static void main(String[] args) {
		// sample input1
		int[] param1 = { 6, 3, 2, 2, 4, 3, 6, 6, 6, 7, 4, 6, 2, 2, 2 };
		int[] param2 = { 4, 18, 5, 22, 9, 26, 5, 22, 1, -2, 1 };
		System.out.println(timeToOverlap(param1, param2));

		// sample input2
		int[] param3 = { 4, 0, 0, 0, 2, 2, 2, 2, 0, -1, 1 };
		int[] param4 = { 4, 10, 0, 10, 2, 12, 2, 12, 0, 1, 1 };
		System.out.println(timeToOverlap(param3, param4));
	}

}
