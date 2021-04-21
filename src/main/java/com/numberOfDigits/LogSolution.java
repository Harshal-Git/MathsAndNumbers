/**
 * 
 */
package com.numberOfDigits;

import static java.lang.Math.*;

/**
 * @author Harshal-Git
 *
 * 	-> Find number of digits from a given number. 
 *	
 *	-> Direct formula / Log approach
 *
 * -> Time complexity:  0(1)
 * -> Space complexity: 0(1)
 * -> Auxiliary space:  0(1)
 */
public class LogSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 1234512;
		System.out.println("Number of digits in "+number+" : "+((int) floor(log10(number)+1)));
		
		number = 564;
		System.out.println("Number of digits in "+number+" : "+((int) floor(log10(number)+1)));
		
		number = 12;
		System.out.println("Number of digits in "+number+" : "+((int) floor(log10(number)+1)));
		
		number = 9;
		System.out.println("Number of digits in "+number+" : "+((int) floor(log10(number)+1)));
	}
}
