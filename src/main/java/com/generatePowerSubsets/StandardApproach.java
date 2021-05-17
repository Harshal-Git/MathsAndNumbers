/**
 * 
 */
package com.generatePowerSubsets;

/**
 * @author Harshal-Git
 *
 *	-> generate power subsets of given data
 *
 * 	-> standard approach : we take length of the given data (n) and generate total number of possible power set (2^n).
 * 							Now for of this value, we will start iterating from the left most and keep shifting right
 * 							by 1 position till we have no bits to shift.
 * 	
 * 							this will generate a series within and using that number, we pick respective character from the string.
 * 
 * 	-> Time complexity: 0(2^n * n) 
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 * 
 * 	-> First go through : FindIndexOfSetBits.java
 */
public class StandardApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String data = "abc";
		System.out.print("Power subset of "+data+" => ");
		printPowerSubset(data);

		data = "ab";
		System.out.print("\nPower subset of "+data+" => ");
		printPowerSubset(data);
	}

	/**
	 * @param data
	 * @return
	 */
	private static void printPowerSubset(String data) {
		
		// data length
		int length = data.length();
		
		// find size of possible subsets
		int possibleOffsets = (int) Math.pow(2, length);

		/*
		 * Find all the bits which are set for given number. 
		 * With the help of such indexes, we can find subsets of given string.
		 */
		for(int index = 0; index < possibleOffsets; index++) {
			
			for(int j = 0; j < index; j++) {
				
				if((index & (1 << j)) != 0) {
					//System.out.print("("+j+")"+data.charAt(j));
					System.out.print(data.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

}
