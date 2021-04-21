/**
 * 
 */
package com.fibonacci;

/**
 * @author Harshal-Git
 *
 *-> Without linear storage approach
 *
 *-> In series, position starts from 0
 *
 * position: 6 = 8
 * position: 3 = 2
 * position: 8 = 21
 * 
 * -> Time complexity:	0(n)
 * -> Space complexity:	0(1)
 * -> Auxiliary space: 	0(1)
 * 
 */
public class WithoutLinearStorage {

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
	 * @param position
	 * @return
	 */
	private static int fibbo(int position) {
		if(position < 0) {
			throw new IllegalArgumentException("Invalid input.");
		}
		if(position == 0 || position == 1) {
			return position;
		}
		int current= 0, previous1 = 1, previous2 = 0;
		for(int i = 2; i <= position; i++) {
			current = previous1+previous2;
			previous2 = previous1;
			previous1 = current;
		}
		return current;
	}

}
