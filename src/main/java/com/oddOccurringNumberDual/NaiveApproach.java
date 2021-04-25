/**
 * 
 */
package com.oddOccurringNumberDual;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Harshal-Git
 *
 *	-> from a given array, find 2 numbers with odd occurrence.
 *
 *	-> naive solution : traverse the array and for each element, calculate the frequency and if that is ODD, print it.
 *
 *	-> this approach will print all possible odd occurring numbers.
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

		int [] data1 = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
		System.out.print("Odd count element in array "+Arrays.toString(data1)+" => ");
		printOddCountElement(data1);

		int [] data2 = {20, 15, 20, 16, 15, 16, 15, 16};
		System.out.print("\nOdd count element in array "+Arrays.toString(data2)+" => ");
		printOddCountElement(data2);

	}

	/**
	 * @param data
	 * @return
	 */
	private static void printOddCountElement(int[] data) {
		Set<Integer> uniqueNumbers = new HashSet<>(); 
		for(int index = 0; index < data.length; index++) {
			int count = 0;
			for(int j = 0; j < data.length; j++) {
				if(data[j] == data[index]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				//System.out.print(data[index]+" ");
				uniqueNumbers.add(data[index]);
			}
		}
		System.out.print(uniqueNumbers.toString());
	}
}
