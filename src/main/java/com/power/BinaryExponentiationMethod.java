/**
 * 
 */
package com.power;

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
 *
 */
public class BinaryExponentiationMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long x = 2;
		int y = 3;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 3; y = 4;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 5; y = 0;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 5; y = 1;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 5; y = 6;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));

		x = 2; y = -3;
		System.out.println("Pow("+x+", "+y+") = "+pow(x, y));
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static double pow(double x, int y) {
		double result = 1.0;
		// mean power (to deal with negative raise)
		int meanPower = 1;
		if(y < 0) {
			meanPower = -y;
			x = 1/x;
		} else {
			meanPower = y;
		}
		// use mean power
		while(meanPower > 0) {
			if(meanPower % 2 != 0) {	// to read the set bit
				result = result * x;
			} 
			x = x * x;
			meanPower = meanPower / 2;
		}
		return result;
	}
}
