/**
 * 
 */
package com.factorsOrDivisorsOfANumber;

/**
 * @author Harshal-Git
 *
 *	-> print divisors or factors of a given number
 *	
 *	-> naive approach : starting from 1 till n; if that number completely divides given number, it's a divisor.
 *
 *	-> Time complexity: 0(n)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 15;
		System.out.print("Divisors of number "+num+" = ");
		printDivisors(num);
		
		num = 100;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 7;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 12;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
	}

	/**
	 * @param num
	 */
	private static void printDivisors(int num) {
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
