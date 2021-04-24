/**
 * 
 */
package com.prime;

/**
 * @author Harshal-Git
 *
 *	-> check current number is prime OR not
 *
 *	-> Naive approach : If the given number is completely divisible only by 1 & the number 
 *						itself and not by any of the numbers in-between, given number is a prime.
 *						
 *						OR
 *
 *						it's divisors are only 1 & the number itself.
 *
 *	-> Time complexity: O(n)- it can perform in constant time also O(1) - for even numbers
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 * 
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 13;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
		
		num = 14;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
		
		num = 101;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
		
		num = 33;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int num) {
		for(int index = 2; index <= num; index++) {
			if(num % index == 0) {
				return false;
			}
		}
		return true;
	}

}
