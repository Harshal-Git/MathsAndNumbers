/**
 * 
 */
package com.fibonacci;

/**
 * @author Harshal-Git
 *
 * -> find fibonacci number at given position 
 * 
 * -> In series, position starts from 0
 * 
 * position: 6 = 8
 * position: 3 = 2
 * position: 8 = 21
 * 
 * -> Time complexity:	0(n)
 * -> Space complexity:	0(n)
 * -> Auxiliary space: 	0(n)
 * 
 */
public class Recursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int position = 6;
		System.out.println("Fibonacci number at position: "+position+" = "+fibbo(position));
		
		position = 3;
		System.out.println("Fibonacci number at position: "+position+" = "+fibbo(position));
		
		position = 8;
		System.out.println("Fibonacci number at position: "+position+" = "+fibbo(position));
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static int fibbo(int number) {
		if(number == 0 || number == 1) {
			return number;
		}
		return fibbo(number-1)+fibbo(number-2);
	}
}
