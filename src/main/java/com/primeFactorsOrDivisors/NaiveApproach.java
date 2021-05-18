/**
 * 
 */
package com.primeFactorsOrDivisors;

/**
 * @author Harshal-Git
 *
 *	-> find prime factors of a given number : 
 *			prime factors = factors of a given number which are only prime
 *			multiplication of such prime factors will give the number itself.
 *
 *	-> naive approach
 *
 *	-> Time complexity: O(n^2 log n) : (n^2) for outer loop, (log n) for internal while loop  
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 *
 */
public class NaiveApproach {

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

		num = 26;
		System.out.print("\nPrime factors of "+num+" = ");
		printPrimeFactors(num);
	}

	/**
	 * @param num
	 */
	private static void printPrimeFactors(int num) {
		int tempVar;
		for(int i = 1; i <= num; i++) {
			if(isPrime(i)) {
				tempVar = i;
				while(num % tempVar == 0) {
					System.out.print(i+" ");
					tempVar = tempVar * i;
				}
			}
		}
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int num) {

		// 1 is not a prime
		if(num == 1) {
			return false;
		}

		// 2 and 3 are prime
		if(num == 2 || num == 3) {
			return true;
		}

		// but if any number is divisible completely by 2 / 3; that is not prime
		if((num % 2 == 0) || (num % 3 == 0)) {
			return false;
		}

		// for remaining all numbers, there can be a pattern 
		// as per that pattern, this loop is written
		for(int index = 5; (index*index) <= num; index = index + 6) {
			if((num % index == 0) || (num % (index+2) == 0)) {
				return false;
			}
		}
		return true;
	}
}
