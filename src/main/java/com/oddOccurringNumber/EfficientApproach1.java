/**
 * 
 */
package com.oddOccurringNumber;

import java.util.Arrays;

/**
 * @author Harshal-Git
 *
 *	-> from a given array, find the number with odd occurrence
 *
 *	-> efficient solution : keep XORing all numbers. XOR of a number with itself will result 0. So at the end, the number
 *							which has odd times presence, will be the result.
 *
 *	-> Time complexity: O(n) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] data1 = {4, 3, 4, 4, 4, 5, 5};
		System.out.println("Odd count element in array "+Arrays.toString(data1)+" => "+getOddCountElement(data1));

		int [] data2 = {8, 7, 7, 8, 8};
		System.out.println("Odd count element in array "+Arrays.toString(data2)+" => "+getOddCountElement(data2));
		
		// catch : might not work in situations where some subsequent numbers XORs results in 0
		int [] data3 = {1, 3, 1, 2};
		System.out.println("Odd count element in array "+Arrays.toString(data3)+" => "+getOddCountElement(data3));
	}

	/**
	 * @param data
	 * @return
	 */
	private static int getOddCountElement(int[] data) {
		int resultXOR = 0;
		for(int index = 0; index < data.length; index++) {
			resultXOR = (resultXOR ^ data[index]);
		}
		return resultXOR;
	}

}
