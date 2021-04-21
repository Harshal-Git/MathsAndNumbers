/**
 * 
 */
package com.numberOfDigits;

/**
 * @author Harshal-Git
 *
 *	-> Find number of digits from a given number. 
 *	
 *	-> Iterative approach
 *
 *	-> Time complexity:  0(log n - base 10) : Floor value
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space:  0(1)
 */
public class Iterative {

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
		
		/**
		 * while loop
		 */
		/*int noOfDigits = 0;
		while(number > 0) {
			noOfDigits++;
			number = number / 10;
		}*/
		
		/**
		 * for loop
		 */
		int noOfDigits;
		for(noOfDigits = 0; number > 0; number = number / 10) {
			noOfDigits++;
		}
		return noOfDigits;
	}
}
