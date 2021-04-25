/**
 * 
 */
package com.bitwiseProblems;

/**
 * @author Harshal-Git
 *
 *	-> program to check whether for given number 'n', a given 'k' th bit is set OR not.
 *
 *	-> approach : We will first perform right shift of given number by K-1 position. If bitwise AND with this new number and '1'
 *					results non-zero, then the Kth bit it set. Otherwise it's not set.
 *
 * 	-> Time complexity: 0(1) 
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 */
public class CheckKthBitRightShift {

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
		if(((n >> (k-1)) & 1) == 1) {
			return "Yes";
		}
		return "No";
	}

}
