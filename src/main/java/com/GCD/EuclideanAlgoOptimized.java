/**
 * 
 */
package com.GCD;

/**
 * @author Harshal-Git
 *
 * 	-> find GCD of 2 given numbers
 * 
 *	-> Efficient approach : Euclidean algo - optimized version  
 *
 *	-> Time complexity: O(log (min(a,b))) 
 *	-> Space complexity: O(gcd(a,b)) - these many recursive stack calls will happen
 *	-> Auxiliary space: O(gcd(a,b))
 */
public class EuclideanAlgoOptimized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 4, b = 6;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 15; b = 10;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 8; b = 28;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 12; b = 5;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 15; b = 12;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
		
		a = 16; b = 2;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
		
		a = 9; b = 10;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
	}

	/**
	 * Euclidean algo
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, (a % b));
		}
	}
}
