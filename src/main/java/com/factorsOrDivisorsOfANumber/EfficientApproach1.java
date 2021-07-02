/**
 * 
 */
package com.factorsOrDivisorsOfANumber;

/**
 * @author Harshal-Git
 *
 *	-> print divisors or factors of a given number
 *
 *	-> efficient approach 1: run the loop till Sqrt(n) and find all lowest divisors of divisor pairs.
 *							then using the first divisor, find second divisor
 *
 *	-> Drawback: divisors will not be printed in sorted order
 *
 *	-> Time complexity: 0(Sqrt(n))
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach1 {

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

		num = 4;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 5;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 28;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
	}

	/**
	 * @param num
	 */
	private static void printDivisors(int num) {
		for(int i = 1; (i*i) <= num; i++) {
			if(num % i == 0) {
				System.out.print(i+" ");
				if(i != (num/i)) {
					System.out.print((num/i)+" ");
				}
			}
		}
	}
}
