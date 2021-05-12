/**
 * 
 */
package com.findMissingNumber;

import java.util.Arrays;

/**
 * @author Harshal-Git
 *
 * Question: Given array of 'n' numbers which has valid range [1... (n+1)]. Every number appears exactly once. 
 * 			 There is one number missing. Find that missing number.
 * 
 *	-> Time complexity: O(n) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class FindMissingNumber2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int data1[] = {1, 4, 3};	// o/p = 2
		System.out.println("Missing number in data: "+Arrays.toString(data1)+" => "+findMissingNumber(data1));
		
		int data2[] = {1, 5, 3, 2};	// o/p = 4
		System.out.println("Missing number in data: "+Arrays.toString(data2)+" => "+findMissingNumber(data2));
	}

	/**
	 * @param data1
	 * @return
	 */
	private static int findMissingNumber(int[] data) {
		int length = data.length;
		// as array is expected to have no repeated number; find expected sum 
		int sum = (((length+1)*(length+2)) / 2);
		
		// now keep subtracting actual array data from sum
		for(int index = 0; index < (data.length); index++) {
			sum = sum - data[index];
		}
		return sum;
	}
}
