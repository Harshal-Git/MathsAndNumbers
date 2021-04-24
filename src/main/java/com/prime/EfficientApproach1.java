/**
 * 
 */
package com.prime;

/**
 * @author Harshal-Git
 *
 *	-> check current number is prime OR not
 *
 *	-> Efficient approach : iterate through Sqrt(n) only.
 *
 *	-> Time complexity: O(Sqrt(n))- it can perform in constant time also O(1) - for even numbers
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach1 {

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
		
		num = 25;
		System.out.println("Is number: "+num+" is prime? "+isPrime(num));
	}
	
	/**
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int num) {
		for(int index = 2; (index*index) <= num; index++) {
			if(num % index == 0) {
				return false;
			}
		}
		return true;
	}

}
