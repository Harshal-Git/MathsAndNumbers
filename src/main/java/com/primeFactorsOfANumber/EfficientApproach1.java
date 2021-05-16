/**
 * 
 */
package com.primeFactorsOfANumber;

/**
 * @author Harshal-Git
 *
 *	-> find prime factors of a given number : 
 *			prime factors = factors of a given number which are only prime
 * 			multiplication of such prime factors will give the number itself.
 *
 *	-> efficient approach 1 : to go till Sqrt(n) instead of full 'n' length
 *
 *	-> Time complexity: O(Sqrt(n) * log n) : Sqrt(n) for outer loop, (log n) for internal while loop; which gets 
												divided by 'i' each time.
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 12;
		System.out.print("Prime factors of "+num+" = ");
		printPrimeFactors(num);

		num = 315;
		System.out.print("\nPrime factors of "+num+" = ");
		printPrimeFactors(num);

		num = 13;
		System.out.print("\nPrime factors of "+num+" = ");
		printPrimeFactors(num);
	}

	/**
	 * @param num
	 */
	private static void printPrimeFactors(int num) {
		if(num == 1) {
			// do nothing
		}
		// as to find prime factors, iterate till Sqrt(n) only 
		for(int i = 2; (i*i) < num; i++) {
			while(num % i == 0) {
				System.out.print(i+" ");
				num = num / i;
			}
		}
		if(num > 1) {
			System.out.print(num+" ");
		}
	}
}
