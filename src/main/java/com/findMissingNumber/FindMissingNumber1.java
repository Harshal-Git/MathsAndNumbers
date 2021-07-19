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
 *	-> Time complexity: O((n+1) + n) ~ O(2n+1) ~ O(n) 
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space: 0(1)
 */
public class FindMissingNumber1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int data1[] = {1, 4, 3};	// o/p = 2
		System.out.println("Missing number in data: "+Arrays.toString(data1)+" => "+findMissingNumber(data1));
		
		int data2[] = {1, 5, 3, 2};	// o/p = 4
		System.out.println("Missing number in data: "+Arrays.toString(data2)+" => "+findMissingNumber(data2));
		
		int data3[] = {2, 5, 3, 4};	// o/p = 1
		System.out.println("Missing number in data: "+Arrays.toString(data3)+" => "+findMissingNumber(data3));
	}

	/**
	 * @param data1
	 * @return
	 */
	private static int findMissingNumber(int[] data) {
		int remainingNumber = 0;
		// as array ranges from 1 -> (n+1); find total XOR till (n+1)
		for(int index = 1; index <= (data.length+1); index++) {
			remainingNumber = (remainingNumber ^ index);
		}
		// now XOR the actual array data
		for(int index = 0; index < (data.length); index++) {
			remainingNumber = (remainingNumber ^ data[index]);
		}
		return remainingNumber;
	}

}
