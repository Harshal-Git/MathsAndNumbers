/**
 * 
 */
package com.numberOfDigits;

/**
 * @author Harshal-Git
 * 
 * 
 *  -> Find number of digits from a given number. 
 *	
 *	-> Recursive approach
 *
 * -> Time complexity:  0(log n - base 10) : Floor value ~ height of the recursion tree
 * -> Space complexity: 0(log n - base 10) 
 * -> Auxiliary space:  0(log n - base 10)
 */
public class Recursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 1234512;
		System.out.println("Number of digits in "+number+" : "+numberOfDigits(number));
		
		number = 564;
		System.out.println("Number of digits in "+number+" : "+numberOfDigits(number));
		
		number = 12;
		System.out.println("Number of digits in "+number+" : "+numberOfDigits(number));
		
		number = 9;
		System.out.println("Number of digits in "+number+" : "+numberOfDigits(number));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int numberOfDigits(int number) {
		if(number == 0) {
			return 0;
		}
		return 1+numberOfDigits(number/10);
	}
}
