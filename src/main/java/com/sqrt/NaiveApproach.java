/**
 * 
 */
package com.sqrt;

/**
 * @author Harshal-Git
 *
 *	-> find square root of given number. If exact square root could not be found; return nearest value of it.
 *
 *	-> naive approach : starting from 1; go till given number 'n' such that for a number 'p' it becomes (p*p > n)
 *						return the (p-1).
 *
 *	-> efficient solution is given in part of binary search module.
 *
 * -> Time complexity: 0(Sqrt n)	
 * -> Space complexity: 0(1)	
 * -> Auxiliary space: 0(1)
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number;
		
		number = 4;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 8;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 9;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 10;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 20;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 31;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 45;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
		
		number = 49;
		System.out.println("Sqrt("+number+") = "+findSqrt(number));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int findSqrt(int number) {
		int index = 1;
		while(true) {
			if((index*index) > number) {
				break;
			}
			index++;
		}
		return (index-1);
	}

}
