/**
 * 
 */
package com.power;

/**
 * @author Harshal-Git
 *
 *	-> calculate power of a given number based on given inputs (X ^ Y) ; Y >= 0
 *
 *	-> efficient approach based on given equation:
 *
 *		pow(x, y) ==> if 'y' is even ==> power(x, y/2) * power(x, y/2)
 *				  ==> else 			 ==> power(x, y-1) * x
 *
 *	-> Time complexity: 0(log n) - recursive tree : T(n) = T(n/2) + c
 *	-> Space complexity: 0(log n)
 *	-> Auxiliary space: 0(log n)
 */
public class EfficientApproach1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double x = 2;
		long y = 3;
		System.out.println("Pow("+x+", "+y+") = "+pow1(x, y));

		x = 3; y = 4;
		System.out.println("Pow("+x+", "+y+") = "+pow2(x, y));

		x = 5; y = 0;
		System.out.println("Pow("+x+", "+y+") = "+pow1(x, y));

		x = 5; y = 1;
		System.out.println("Pow("+x+", "+y+") = "+pow2(x, y));

		x = 5; y = 10;
		System.out.println("Pow("+x+", "+y+") = "+pow1(x, y));

		x = 8; y = 10;
		System.out.println("Pow("+x+", "+y+") = "+pow2(x, y));

		x = 2.0; y = 10;
		System.out.println("Pow("+x+", "+y+") = "+pow1(x, y));

		x = 2.0; y = -2;
		System.out.println("Pow("+x+", "+y+") = "+pow2(x, y));

		x = 1.0; y = 2147483647;
		System.out.println("Pow("+x+", "+y+") = "+pow1(x, y));
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static double pow1(double x, long y) {
		// corner case
		if(y == 0) {
			return 1.0;
		} else if(y == 1) {
			// base case
			return x;
		} else if(y < 0) {
			// if raise is negative; x is inversed & raise is negated (to make it positive)
			return pow1(1/x, -y);
		}
		else {
			// otherwise
			double temp = pow1(x*x, (y/2)); 
			// if 'y' is ODD
			if(y % 2 == 1) {
				return (temp*x);
			} else {
				// if 'y' is EVEN
				return temp;
			}
		}
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static double pow2(double x, long y) {
		// corner case
		if(y == 0) {
			return 1.0;
		} else if(y == 1) {
			// base case
			return x;
		} else if(y < 0) {
			// if raise is negative; x is inversed & raise is negated (to make it positive)
			return pow2(1/x, -y);
		}
		else {
			// otherwise
			double temp = pow2(x, (y/2)); 
			// if 'y' is ODD
			if(y % 2 == 1) {
				return (temp*x*temp);
			} else {
				// if 'y' is EVEN
				return (temp*temp);
			}
		}
	}
}
