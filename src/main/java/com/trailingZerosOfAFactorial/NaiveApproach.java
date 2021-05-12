/**
 * 
 */
package com.trailingZerosOfAFactorial;

/**
 * @author Harshal-Git
 *
 *	-> find number of trailing 0s in a factorial of a given number
 *
 *	-> naive approach  : integer / long data overflow issue during factorial finding
 *
 *	-> Time complexity:  [ 0(n) for factorial + 0(log n - base 10 )] ~ 0(n) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 *
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number = 8;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 3;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 10;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
		
		number = 20;
		System.out.println("Trailing 0s in ("+number+")! = "+findTrailingZeros(number));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int findTrailingZeros(int number) {
		long factorial = findFactorial(number);
		//System.out.println("("+number+")!= "+factorial);
		int zerosCount = 0;
		
		/**
		 * while loop
		 */
		/*while(factorial % 10 == 0) {
			zerosCount++;
			factorial = factorial / 10;
		}*/
		
		/**
		 * for loop
		 */
		for(; (factorial % 10) == 0; factorial = factorial / 10) {
			zerosCount++;
		}
		return zerosCount;
	}

	/**
	 * @param number
	 * @return
	 */
	private static long findFactorial(int number) {
		long result = 1;
		for(int index = number; index > 0; index--) {
			result = result*(index);
		}
		return result;
	}
}
