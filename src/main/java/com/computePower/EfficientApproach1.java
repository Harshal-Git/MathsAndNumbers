/**
 * 
 */
package com.computePower;

/**
 * @author Harshal-Git
 *
 *	-> calculate power of a given number based on given inputs (X ^ Y) ; Y >= 0
 *
 *	-> efficient approach based on given equation:
 *
 *		pow(x, y) ==> if 'y' is even ==> power(x, y/2) * power(x, y/2)
 *				  ==> else 			 ==> power(x, y-1) * x
 *
 *	-> Time complexity: 0(log n) - recursive tree : T(n) = T(n/2) + c
 *	-> Space complexity: 0(log n)
 *	-> Auxiliary space: 0(log n)
 */
public class EfficientApproach1 {

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
		
		if(y == 0) {
			return 1;
		}
		
		int temp = pow(x, (y/2)); 
				
		if(y % 2 == 0) {
			return (temp*temp);
		} else {
			return (temp*temp*x);
		}
	}
}
