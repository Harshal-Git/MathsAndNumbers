/**
 * 
 */
package com.bitwiseProblems;

/**
 * @author Harshal-Git
 *
 *	-> program to check whether for given number 'n', a given 'k' th bit is set OR not.
 *
 *	-> approach : We will perform bitwise AND of the given number and the number X for which there will be a bit set 
 *				 at the Kth position. If this AND operation results as 0, the bit is not set; otherwise it's set.
 *
 * 				To prepare such number X for which there will be a bit set at Kth position, we will do left 
 * 				shift of 1 for (k-1) times.
 * 
 * 	-> Time complexity: 0(1) 
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 */
public class CheckKthBitLeftShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 8, k = 2;
		System.out.println("For "+n+" whether "+k+"th bit is set? "+isKthBitSet(n, k));
		
		n = 5; k = 3;
		System.out.println("For "+n+" whether "+k+"th bit is set? "+isKthBitSet(n, k));
		
		n = 0; k = 3;
		System.out.println("For "+n+" whether "+k+"th bit is set? "+isKthBitSet(n, k));
		
		n = 5; k = 1;
		System.out.println("For "+n+" whether "+k+"th bit is set? "+isKthBitSet(n, k));
	}

	/**
	 * @param n
	 * @param k
	 * @return
	 */
	private static String isKthBitSet(int n, int k) {
		if((n & (1 << (k-1))) != 0) {
			return "Yes";
		}
		return "No";
	}

}
