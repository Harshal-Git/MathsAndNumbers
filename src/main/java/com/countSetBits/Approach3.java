/**
 * 
 */
package com.countSetBits;

/**
 * @author Harshal-Git
 *
 *	-> count number of set bits in a given number
 *
 *	-> approach 3: same approach as Approach 1 ; but with bit shift operators.  
 * 
 * 	-> Time complexity: 0(total bits of n)
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 * 
 */
public class Approach3 {

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
	 * @param num
	 * @return
	 */
	private static int countSetBits(int num) {
		int compareNum = 0;
		int moveIndex = 0;
		int setBits = 0;
		while(compareNum <= num) {
			compareNum = 1 << moveIndex;
			if((num & compareNum) != 0) {
				setBits++;
			}
			moveIndex++;
		}
		return setBits;
	}
}
