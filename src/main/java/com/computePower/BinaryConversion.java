/**
 * 
 */
package com.computePower;

/**
 * @author Harshal-Git
 *
 * -> convert a given number into it's binary representation (base 2)
 * 
 * Base 2 binary representation : 2^3 | 2^2 | 2^1 | 2^0
 * 
 * 							 10 =  1  |  0  |  1  |  0 	
 * 
 * -> as loop starts dividing from higher to lower number, we get conversion in reverse. So at the end, result needs 
 * 	to be reversed.
 * 
 * 	-> Time complexity: 0(log n) 
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 *   
 */
public class BinaryConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 10;
		System.out.println("Binary value of "+num+" : "+binary(num));
		
		num = 19;
		System.out.println("Binary value of "+num+" : "+binary(num));
		
		num = 40;
		System.out.println("Binary value of "+num+" : "+binary(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static String binary(int num) {
		StringBuilder builder = new StringBuilder();
		while(num > 0) {
			if(num % 2 != 0) {
				builder.append("1");
			} else {
				builder.append("0");
			}
			num = num / 2;
		}
		return builder.reverse().toString();
	}

}
