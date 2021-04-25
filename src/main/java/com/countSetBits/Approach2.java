/**
 * 
 */
package com.countSetBits;

/**
 * @author Harshal-Git
 *
 *	-> count number of set bits in a given number
 *
 * 	-> approach 2: same approach as Approach 1 ; but with bit shift operators.  
 * 
 * 	-> Time complexity: 0(total bits of n)
 * 	-> Space complexity: 0(1)	
 * 	-> Auxiliary space: 0(1)
 */
public class Approach2 {

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

		/**
		 * option 1
		 */
		/*while(n > 0) {
			if((n & 1) == 1) {		// & with 1 results in 1; which says it has a remainder
				setBitsCount++;
			}	
			n = n >> 1;				// signed right shift by 1 = division by 2
		}*/

		/**
		 * option 2
		 */
		while(n > 0) {
			setBitsCount = setBitsCount + (n & 1);
			n = n >> 1;				
		}

		return setBitsCount;
	}

}
