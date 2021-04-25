/**
 * 
 */
package com.computePower;

/**
 * @author Harshal-Git
 *
 *	-> calculate power of a given number based on given inputs (X ^ Y) ; Y >= 0
 *	
 *	-> naive approach : simple calculation
 *
 *	-> Time complexity: 0(power number)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class NaiveApproach {

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
		
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static int pow(int x, int y) {
		int num = 1;
		for(int i = 1; i <= y; i++) {
			num = num*x;
		}
		return num;
	}

}
