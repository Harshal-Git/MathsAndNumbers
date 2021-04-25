/**
 * 
 */
package com.countSetBits;

/**
 * @author Harshal-Git
 *
 *	-> count number of set bits in a given number
 *
 * 	-> approach 1: we can keep dividing the given number by 2 and can check whether it gives a remainder when dividing by 2 OR not.
 * 					if it has remainder, increment the set bit count.  
 * 
 * 	-> Time complexity: 0(log n)
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 * 
 */
public class Approach1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 5;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 7;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 13;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 17;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 33;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 54;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static int countSetBits(int n) {
		int setBitsCount = 0;
		while(n > 0) {
			if(n % 2 != 0) {
				setBitsCount++;
			}
			n = n/2;
		}
		return setBitsCount;
	}

}
