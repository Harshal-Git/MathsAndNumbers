/**
 * 
 */
package com.fibonacci;

/**
 * @author Harshal-Git
 *
 *-> Linear storage approach : store calculated numbers into an array and 
 *	at the end, return the last element of the array.
 *
 *-> In series, position starts from 0
 *
 * position: 6 = 8
 * position: 3 = 2
 * position: 8 = 21
 * 
 * -> Time complexity:	0(n)
 * -> Space complexity:	0(n)
 * -> Auxiliary space:  0(n)
 *  
 */
public class LinearStorage {

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
		int [] data = new int[position+1];
		data[0] = 0;
		data[1] = 1;
		for(int i = 2; i <= position; i++) {
			data[i] = data[i-1]+data[i-2];
		}
		//System.out.println(Arrays.toString(data));
		return data[position];
	}

}
