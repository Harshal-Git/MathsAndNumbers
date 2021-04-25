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
 *	-> naive solution : traverse the array and for each element, calculate the frequency and if that is ODD, print it.
 *
 *	-> this approach will print first ever odd occurrence elements.
 *
 *	-> Time complexity: O(n^2) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] data1 = {4, 3, 4, 4, 4, 5, 5};
		System.out.println("Odd count element in array "+Arrays.toString(data1)+" => "+getOddCountElement(data1));

		int [] data2 = {8, 7, 7, 8, 8};
		System.out.println("Odd count element in array "+Arrays.toString(data2)+" => "+getOddCountElement(data2));

	}

	/**
	 * @param data
	 * @return
	 */
	private static int getOddCountElement(int[] data) {
		for(int index = 0; index < data.length; index++) {
			int count = 0;
			for(int j = 0; j < data.length; j++) {
				if(data[j] == data[index]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				return data[index];
			}
		}
		return -1;
	}
}
