/**
 * 
 */
package com.factorial;

/**
 * @author Harshal-Git
 * 
 * -> find factorial of a given number
 * 
 * -> recursive approach  : integer / long data overflow issue
 * 
 *  -> Time complexity: 0(n) ==> T(n) = T(n-1) + c
 *	-> Space complexity: 0(n)
 *	-> Auxiliary space: 0(n)
 */
public class Recursive {

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
		
	}

	/**
	 * @param number
	 * @return
	 */
	private static int findFactorial(int number) {
		if(number <= 1) {
			return 1;
		}
		return ((number)*findFactorial(number-1)); 
	}

}
