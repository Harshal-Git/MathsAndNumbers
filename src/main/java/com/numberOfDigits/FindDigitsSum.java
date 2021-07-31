/**
 * 
 */
package com.numberOfDigits;

/**
 * @author Harshal-Git
 *
 *	-> Keep adding digits of a number until the sum of digits results in a single digit.
 */
public class FindDigitsSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long num = 159;
		//System.out.println("Number= "+num+" => result: "+findSum1(num));
		System.out.println("Number= "+num+" => result: "+findSum2(num));

		num = 1234567890;
		//System.out.println("\nNumber= "+num+" => result: "+findSum1(num));
		System.out.println("Number= "+num+" => result: "+findSum2(num));

		num = 666;
		//System.out.println("\nNumber= "+num+" => result: "+findSum1(num));
		System.out.println("Number= "+num+" => result: "+findSum2(num));

		num = 99999999;
		//System.out.println("\nNumber= "+num+" => result: "+findSum1(num));
		System.out.println("Number= "+num+" => result: "+findSum2(num));
	}

	/**
	 * 
	 * @param num - any number
	 * @return - sum of all digits until it becomes single digit
	 * 
	 * -> Time complexity:	O([number of digits]) ~ O([log n - base 10])
	 * -> Space complexity:	O([log n - base 10]) - after first process; it's a recursive call
	 * -> Auxiliary space: O([log n - base 10]) - after first process; it's a recursive call
	 * 
	 */
	private static long findSum1(long num) {
		// find sum for given number
		long sum = 0;
		long temp = num;
		while(temp > 0) {
			sum += (temp%10);
			temp /= 10;
		}
		//if some is in single digit result : return it
		if(sum > 0 && sum <= 9) {
			return sum;
		} else {
			// otherwise keep calling the function
			return findSum1(sum);
		}
	}

	/**
	 * 
	 * @param num - any number
	 * @return - sum of all digits until it becomes single digit
	 * 
	 * -> Time complexity:	O([number of digits]) ~ O([log n - base 10])
	 * -> Space complexity:	0(1)
	 * -> Auxiliary space: 0(1)
	 * 
	 */
	private static long findSum2(long num) {
		// initializations
		long sum = 0;
		long temp = num;
		do {
			// reset calculations for new sum process
			if(sum != 0) {
				temp = sum;
				sum = 0;
			}
			// digits addition
			while(temp > 0) {
				sum += (temp%10);
				temp /= 10;
			}
		} while(sum > 9);	// at last; sum has to be in single digit
		// once it's in single digit; return it
		return sum;
	}

}