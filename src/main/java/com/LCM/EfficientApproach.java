/**
 * 
 */
package com.LCM;

/**
 * @author Harshal-Git
 * 
 * 	-> find LCM of 2 given numbers
 * 
 *	-> Efficient approach: Formula based on GCD of given numbers.
 *			
 *					LCM(a, b) = (a * b) / GCD(a, b); 
 *
 *	-> Time complexity:  O(log (min(a,b))) 
 *	-> Space complexity: O(log (min(a,b)))
 *	-> Auxiliary space:  O(log (min(a,b)))
 */
public class EfficientApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 4, b = 6;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));

		a = 12; b = 15;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));

		a = 2; b = 8;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));

		a = 3; b = 7;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	private static int findLCM(int a, int b) {
		// find GCD & use LCM formula
		return ((a * b) / gcd(a, b));
	}

	/**
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
