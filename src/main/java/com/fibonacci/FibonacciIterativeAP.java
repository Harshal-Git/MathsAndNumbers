/**
 * 
 */
package com.fibonacci;

/**
 * @author Harshal-Git
 *
 * -> find fibonacci number at given position.
 */
public class FibonacciIterativeAP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long position = 0;
		
		position = 45;
		System.out.println("Fibonacci number at position: "+position+" = "+findFibonacci(position));
		
		position = 3;
		System.out.println("Fibonacci number at position: "+position+" = "+findFibonacci(position));
		
		position = 8;
		System.out.println("Fibonacci number at position: "+position+" = "+findFibonacci(position));
		
		position = 2;
		System.out.println("Fibonacci number at position: "+position+" = "+findFibonacci(position));
	}

	/**
	 * @param position
	 * @return
	 */
	private static long findFibonacci(long position) {
		// initial elements
		long a = 0, b = 1;
		long res = 0;
		// as 1st number is already processed; process remaining
		for(int i = 1; i < position; i++) {
			res = (a+b);
			a = b;
			b = res;
		}
		return b;
	}
}