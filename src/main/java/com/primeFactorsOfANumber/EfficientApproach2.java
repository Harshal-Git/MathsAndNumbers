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
 *	-> efficient approach 2 : using extended version of method to check prime number.
 *
 *	-> Time complexity: O(Sqrt(n))   
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach2 {

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
		// Stage#1
		if(num == 1) {
			// do nothing
		}
		/*
		 * Stage#2
		 * separately take care of numbers such as '2' & '3' to 
		 * save main loop iterations and find factors with 2 & 3
		 */
		while(num % 2 == 0) {
			System.out.print(2+" ");
			num = num / 2;
		}
		while(num % 3 == 0) {
			System.out.print(3+" ");
			num = num / 3;
		}

		/*
		 * Stage#3
		 * as 2 & 3 divisors are already processed, take remaining numbers
		 */
		for(int i = 5; (i*i) < num; i= i + 6) {
			while((num % i) == 0) {
				System.out.print(i+" ");
				num = num / i;
			}
			while((num % (i+2)) == 0) {
				System.out.print(i+" ");
				num = num / (i+2);
			}
		}
		// if any remainder is still present after Stage#4; print those directly 
		if(num >= 5) {
			System.out.print(num+" ");
		}
	}
}
