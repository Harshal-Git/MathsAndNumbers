/**
 * 
 */
package com.prime;

/**
 * @author Harshal-Git
 *
 *	-> check current number is prime OR not
 *
 *	-> Efficient approach 2: iterate through Sqrt(n) only with some more checks.
 *
 *	-> Time complexity: O(Sqrt(n) / 6) ~ O(Sqrt(n))- it can perform in constant time also O(1) - for even numbers
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach2 {

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
		
		num = 1031;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
		
		num = 25;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
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
