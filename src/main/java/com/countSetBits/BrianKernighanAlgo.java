/**
 * 
 */
package com.countSetBits;

/**
 * @author Harshal-Git
 *
 *	-> count number of set bits in a given number
 *
 * 	-> approach 3: Brian Kernighan's algorithm : Subtracting 1 from a given number and performing AND operation with actual number 
 * 					will unset the right most bit in binary representation of the number.    
 * 
 *  -> For any number 'n', if we keep performing AND operation with (n-1), the operation will keep removing the right most set bit 
 *  	from number 'n' and will provide a new number 'p' (p < n). We can repeat the process till 'p' becomes 0 and count such AND 
 *  	operations; which will be same as the number of set bits in 'n'.  
 * 
 * 	-> Time complexity: 0(total set bits of n)
 * 	-> Space complexity: 0(1)	
 * 	-> Auxiliary space: 0(1)
 */
public class BrianKernighanAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 5;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));

		n = 7;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));

		n = 13;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));

		n = 17;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));

		n = 31;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 33;
		System.out.println("Set bits in "+n+" = "+countSetBits(n));

		n = 54;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));
		
		n = 40;
		//System.out.println("Set bits in "+n+" = "+countSetBits(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static int countSetBits(int n) {
		int setBitsCount = 0;
		System.out.println("1:"+n);
		while(n > 0) {
			n = (n & (n-1));
			System.out.println("2:"+n);
			setBitsCount++;
		}
		return setBitsCount;
	}

}
