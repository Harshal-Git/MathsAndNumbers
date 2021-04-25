/**
 * 
 */
package com.powerOf2;

/**
 * @author Harshal-Git
 *
 *	-> find whether given number is power of 2 OR not
 *
 *	-> efficient approach : for any number to be power of 2, it will have exactly 1 bit set in it's binary representation.
 *							so for such numbers, if AND operation is performed with (number-1); it will always result in 0
 *							as per Brian Kerningam's algorithm.
 *
 *	-> Time complexity: 0(1) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space:	0(1)
 */
public class EfficientApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 4;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 6;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 10;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 16;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 18;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 1;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
		
		num = 0;
		System.out.println("Is "+num+" power of 2? "+isPowerOf2(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPowerOf2(int num) {
		if(num == 0) {
			return false;
		}
		return ((num & (num-1)) == 0);
	}

}
