/**
 * 
 */
package com.GCD;

/**
 * @author Harshal-Git
 *
 *	-> find GCD of 2 given numbers
 *
 *	-> Efficient approach : Euclidean algo  
 *
 *	-> Time complexity: O(n / 2) ~ 0(n)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 *
 */
public class EuclideanAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 4, b = 6;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 100; b = 200;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 8; b = 28;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 12; b = 5;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));

		a = 15; b = 12;
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
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
