/**
 * 
 */
package com.generatePower;

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
 */
public class StandardApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String data = "abc";
		System.out.print("Power subset of "+data+" => ");
		printPowerSubset(data);

		/*data = "ab";
		System.out.print("\nPower subset of "+data+" => ");
		printPowerSubset(data);*/
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

		// now loop from 1 -> offsets
		for(int index = 0; index < possibleOffsets; index++) {
			
			// start internal loop which will prepare offset based on binary 
			// representation of index : starting from 0 
			for(int j = 0; j < index; j++) {
				
				if((index & (1 << j)) != 0) {
					System.out.print(data.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

}
