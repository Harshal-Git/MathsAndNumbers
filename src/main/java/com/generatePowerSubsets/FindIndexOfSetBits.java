/**
 * 
 */
package com.generatePowerSubsets;

/**
 * @author Harshal-Git
 *
 *	-> For any given number 'k'; find index of set bit/s in it's binary representation.
 *
 * 	-> Starting from 2^0, this program will print the index where bits are set. 
 * 
 * 	-> Time complexity: 0(n) 
 * 	-> Space complexity: 0(1)
 * 	-> Auxiliary space: 0(1)
 */
public class FindIndexOfSetBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 8;
		printMessage(num);
		
		num = 9;
		printMessage(num);
		
		num = 18;
		printMessage(num);
		
		num = 25;
		printMessage(num);
	}

	/**
	 * @param num
	 */
	private static void printMessage(int num) {
		System.out.print("Index of set bits in binary number "+num+" => ");
		findIndexOfSetBits(num);
	}

	/**
	 * @param num
	 */
	private static void findIndexOfSetBits(int num) {
		int index = 0;
		while(index <= num) {
			// for position of each set bit 
			if((num & (1 << index)) != 0) {
				System.out.print(index+" ");
			}
			index++;
		}
		System.out.println();
	}

}
