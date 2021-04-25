/**
 * 
 */
package com.bitwiseOperations;

/**
 * @author Harshal-Git
 *
 *	-> basic bitwise operations in java
 *
 *	-> java has 32 bits of binary representation of any integer number
 *
 *									  2^3   2^2   2^1	2^0
 *
 *	-> binary representations of: 3 -  0     0     1     1
 *
 *								  6 -  0     1     0     1
 *
 *	-> Bitwise AND '&' : if all bits are '1', then only return '1'; else return '0'
 *
 *	-> Bitwise OR '|'  : if any bit is '1', then return '1'; else return '0'
 *
 *	-> Bitwise XOR '^' : if all comparison bits are different, then only return '1'; else return '0'
 *
 *	-> Bitwise NOT '~' : it converts given number into it's binary representation & then inverts all bits of the result
 */
public class BitwiseOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 3, b = 6;
		
		// bitwise AND
		System.out.println("("+a+" & "+b+") = "+(a & b));
		
		// bitwise OR
		System.out.println("("+a+" | "+b+") = "+(a | b));
		
		// bitwise XOR
		System.out.println("("+a+" ^ "+b+") = "+(a ^ b));
		
		// bitwise NOT
		System.out.println("(~"+a+") = "+(~a));
	}
}
