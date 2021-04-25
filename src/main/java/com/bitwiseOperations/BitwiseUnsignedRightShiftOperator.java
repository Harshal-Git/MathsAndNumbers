/**
 * 
 */
package com.bitwiseOperations;

/**
 * @author Harshal-Git
 *
 * -> bitwise shift operations in java
 * 
 * >>>> : unsigned right shift operator - shift the binary digits of given number to right : ignoring trailing bits
 * 							- this results in given number divided with 2 with shift position as power 
 * 
 * -> it fills leading bits with 0 for negative & positive both types of number. 
 * 
 */
public class BitwiseUnsignedRightShiftOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 33, y = 8, z = -2;
		
		// right shift operator
		
		// right shift digits by 1 place
		System.out.println("("+x+" >>> 1) = "+(x >>> 1)); // (3/(2^1) : shift position as power of 2)
		System.out.println("("+y+" >>> 1) = "+(y >>> 1)); // (4/(2^1))
		System.out.println("("+z+" >>> 1) = "+(z >>> 1));// (-1/(2^1))

		// right shift digits by 2 place
		System.out.println("("+x+" >>> 2) = "+(x >>> 2)); // (3/(2^2))
		System.out.println("("+y+" >>> 2) = "+(y >>> 2));// (4/(2^2))
		System.out.println("("+z+" >>> 2) = "+(z >>> 2));// (-1/(2^2))
		
	}

}
