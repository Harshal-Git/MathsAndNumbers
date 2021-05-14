/**
 * 
 */
package com.countSetBits;

/**
 * @author Harshal-Git
 *
 *	-> count number of set bits in a given number
 *
 * 	-> approach 3: Brian Kernighan's algorithm
 * 
 *  -> this algo works on the principle of keep subtracting 1 from given number & performing AND operation with the previous 
 *  	number till the time result becomes 0. Count of such AND operations will give the set bits.
 *  
 *  -> how this works? for any number, if 1 is subtracted from that number, then all the 0 digits after the last (OR right most) 
 *  					set bit becomes 1. So AND operation with the number AND (number-1) will remove all the set bits from 
 *  					right side. And doing such operations repeatedly, complete number can be turned to 0.
 * 
 * 	-> Time complexity: 0(total set bits of n)
 * 	-> Space complexity: 0(1)	
 * 	-> Auxiliary space: 0(1)
 */
public class BrianKernighanAlgo {

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
		
		n = 40;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static int countSetBits(int n) {
		int setBitsCount = 0;
		while(n > 0) {
			n = (n & (n-1));
			setBitsCount++;
		}
		return setBitsCount;
	}

}
