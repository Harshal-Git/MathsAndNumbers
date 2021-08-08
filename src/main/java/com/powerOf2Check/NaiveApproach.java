/**
 * 
 */
package com.powerOf2Check;

/**
 * @author Harshal-Git
 *
 *	-> find whether given number is power of 2 OR not
 *
 *	-> naive approach : keep dividing given number by 2 and keep checking remainder. If it has a remainder, it's not power of 2.
 *
 *	-> Time complexity: O(log n - base 2) : with each iteration, number gets divided by 2 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 4;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 6;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 10;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 16;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 18;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPowerOf2(int num) {
		if(num == 0) {
			return false;
		}
		while(num != 1) {
			// if at any point; number becomes ODD 
			if((num % 2) != 0) {
				return false;
			}
			num = num / 2;
		}
		return true;
	}

}
