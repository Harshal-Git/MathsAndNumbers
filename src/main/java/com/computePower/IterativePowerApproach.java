/**
 * 
 */
package com.computePower;

/**
 * @author Harshal-Git
 * 
 * -> calculate power of a given number based on given inputs (X ^ Y) ; Y >= 0
 * 
 * -> calculate this using binary exponentiation method 
 * 
 *   ex: pow(4, 5) => can be represented as (4^4 * 4^1) and this can be converted as:
 *   
 * Base 4 binary representation : 4^4 | 4^3 | 4^2 | 4^1 
 * 
 * 					(4^4 * 4^1) =  1  |  0  |  0  |  1
 *
 *	so find all values where '1' is present and multiply those values.
 *
 *	-> Time complexity: 0(log n) : y gets divided by 2
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class IterativePowerApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 2, y = 3;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 3; y = 4;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 5; y = 0;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 5; y = 1;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));
		
		x = 5; y = 10;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static long pow(int x, int y) {
		long result = 1;
		while(y > 0) {
			if(y % 2 != 0) {
				result = result * x;
			}
			x = x * x;
			y = y / 2;
		}
		return result;
	}
}
