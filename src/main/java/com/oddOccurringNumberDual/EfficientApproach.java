/**
 * 
 */
package com.oddOccurringNumberDual;

import java.util.Arrays;

/**
 * @author Harshal-Git
 * 
 *	-> from a given array, find 2 numbers with odd occurrence.
 *
 *	-> efficient solution 
 *
 *	-> this approach will print exactly 2 odd occurring numbers.
 *
 *	-> Time complexity: 0(n + n) ~ 0(n)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class EfficientApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] data1 = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
		System.out.print("Odd count element in array "+Arrays.toString(data1)+" => ");
		printOddCountElement(data1);

		int [] data2 = {20, 15, 20, 16, 15, 16, 15, 16};
		System.out.print("\nOdd count element in array "+Arrays.toString(data2)+" => ");
		printOddCountElement(data2);
	}

	/**
	 * @param data1
	 */
	private static void printOddCountElement(int[] data) {
		int resultXOR = 0, result1 = 0, result2 = 0;
		
		// first XOR all array numbers
		for(int index = 0; index < data.length; index++) {
			resultXOR = resultXOR ^ data[index];
		}
		
		// find the right most set bit of above result
		int rightMostSetBit = resultXOR & (~(resultXOR-1));
		
		// divide complete array data in 2 groups such that that half of the numbers will 
		// have the bit set at the place of rightMostBitSet and remaining will not have.
		for(int index = 0; index < data.length; index++) {
			if((data[index] & rightMostSetBit) != 0) {
				result1 = (result1 ^ data[index]);
			} else {
				result2 = (result2 ^ data[index]);
			}
		}
		// print those numbers
		System.out.print(result1+" "+result2);
	}
}
