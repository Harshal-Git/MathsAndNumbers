/**
 * 
 */
package com.factorial;

/**
 * @author Harshal-Git
 *
 *	-> find factorial of a given number
 *
 *	-> iterative approach : integer / long data overflow issue
 *
 *	-> Time complexity: 0(n)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class Iterative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 4;
		System.out.println("("+number+")! = "+findFactorial(number));
		
		number = 23;
		System.out.println("("+number+")! = "+findFactorial(number));
		
		number = 15;
		System.out.println("("+number+")! = "+findFactorial(number));
		
		number = 20;
		System.out.println("("+number+")! = "+findFactorial(number));
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
