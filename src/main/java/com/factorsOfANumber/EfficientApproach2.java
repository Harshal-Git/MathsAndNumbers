/**
 * 
 */
package com.factorsOfANumber;

/**
 * @author Harshal-Git
 *
 *	-> print divisors or factors of a given number
 *
 *	-> efficient approach 1: run the loop till Sqrt(n) and find all lowest divisors of divisor pairs.
 *							then run second loop and print second divisor of the divisor pairs
 *
 *	-> this needs to be done to print divisors in sorted order and keeping the complexity to Sqrt(n)
 *
 *	-> Time complexity: 0(Sqrt(n)) + 0(Sqrt(n)) ~ 0(Sqrt(n))
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach2 {

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
		
		num = 2;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);

		num = 4;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 9;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 49;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 25;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 36;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 64;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 81;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
		num = 121;
		System.out.print("\nDivisors of number "+num+" = ");
		printDivisors(num);
		
	}

	/**
	 * @param num
	 */
	private static void printDivisors(int num) {
		int i;
		for(i = 1; (i*i) < num; i++) {
			if(num % i == 0) {
				System.out.print(i+" ");
			}
		}
		for(; i >= 1; i--) {
			if(num % i == 0) {
				System.out.print((num/i)+" ");
			}
		}
	}
}
