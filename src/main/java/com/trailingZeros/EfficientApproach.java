/**
 * 
 */
package com.trailingZeros;

/**
 * @author Harshal-Git
 * 
 *  -> find number of trailing 0s in a factorial of a given number
 *
 *	-> Efficient approach : this will not calculate any factorial; so no integer / long value overflow.
 *
 *	-> Time complexity:  0(log n - base 5)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number = 8;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 13;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 24;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 100;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int findTrailingZeros(int number) {
		int total = 0;
		for(int i = 5; i <= number; i= i*5) {
			total = total + (number/i);
		}
		return total;
	}

}
