/**
 * 
 */
package com.GCD;

/**
 * @author Harshal-Git
 *
 *	-> find GCD of 2 given numbers
 *
 *	-> naive approach : After finding lowest number from given inputs, starting from that, keep on decreasing number; 
 *						till we find some number which completely divides all given inputs. That's GCD for all inputs.  
 *
 *	-> Time complexity: O(min (a, b)) : iteration from 1 to min(a,b)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 *
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 4, b = 6;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
		
		a = 100; b = 200;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
		
		a = 7; b = 13;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
		
		a = 9; b = 10;
		System.out.println("GCD("+a+", "+b+") = "+gcd(a, b));
	}

	/**
	 * find GCD
	 * @param a - first number
	 * @param b - second number
	 * @return - GCD of both numbers
	 */
	private static int gcd(int a, int b) {
		// get lowest number
		int min = (a < b) ? a : b;
		
		for(int index = min; index >= 1; index--) {
			if((a % index == 0) && (b % index == 0)) {
				return index;
			}
		}
		return a;
	}

}
