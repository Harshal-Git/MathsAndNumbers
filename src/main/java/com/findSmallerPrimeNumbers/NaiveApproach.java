/**
 * 
 */
package com.findSmallerPrimeNumbers;

/**
 * @author Harshal-Git
 *
 *	-> find all prime numbers smaller OR equal to the given number
 *
 *	-> Time complexity: O(n*Sqrt(n)) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 *
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 10;
		System.out.print("Prime numbers <= "+num+" : ");
		printNumbers(num);
		
		num = 26;
		System.out.print("\nPrime numbers <= "+num+" : ");
		printNumbers(num);
		
		num = 33;
		System.out.print("\nPrime numbers <= "+num+" : ");
		printNumbers(num);
		
		num = 17;
		System.out.print("\nPrime numbers <= "+num+" : ");
		printNumbers(num);
		
		num = 23;
		System.out.print("\nPrime numbers <= "+num+" : ");
		printNumbers(num);
	}

	/**
	 * @param num
	 * @return
	 */
	private static void printNumbers(int num) {
		for(int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
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
		
		// 2 and 3 alone are prime
		if(num == 2 || num == 3) {
			return true;
		}
		
		// but if any number is divisible completely by 2 / 3; those are not prime
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
