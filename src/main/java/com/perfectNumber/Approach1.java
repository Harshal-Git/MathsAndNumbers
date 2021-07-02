/**
 * 
 */
package com.perfectNumber;

/**
 * @author Harshal-Git
 *
 *	-> Write a function to determine whether given number is perfect number OR not. 
 *
 *	-> A Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 *
 *	For ex, 28 = 1 + 2 + 4 + 7 + 14 => then 28 is perfect number.
 *	[another example = 6 (1 * 2 * 3) => (1+2+3)]
 *	
 * -> Time complexity:	Sqrt(n) [n - input number]
 * -> Auxiliary space: 0(1)
 */
public class Approach1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 0;
		
		// case 1
		num = 28;
		System.out.println("\nNumber: "+num+" is perfect number? "+isPerfectNumber(num));
		
		// case 2
		num = 15;
		System.out.println("\nNumber: "+num+" is perfect number? "+isPerfectNumber(num));
		
		// case 3
		num = 100;
		System.out.println("\nNumber: "+num+" is perfect number? "+isPerfectNumber(num));
		
		// case 4
		num = 4;
		System.out.println("\nNumber: "+num+" is perfect number? "+isPerfectNumber(num));
		
		// case 5
		num = 6;
		System.out.println("\nNumber: "+num+" is perfect number? "+isPerfectNumber(num));
	}

	/**
	 * method to check whether given number is perfect number OR not.
	 * 
	 * step: find all +ve divisors of a given number without the actual number & repetition 
	 * if sum of all such divisors results same as number; that number is perfect number.
	 * 
	 * @param num - input number 
	 * @return true : if number is perfect; false otherwise
	 */
	private static boolean isPerfectNumber(int num) {
		// for comparison
		int tempNum = num;
		
		int indexDiv = 0;
		int divSum = 0;
		
		// find divisors of current number & find sum of those
		for(int index = 1; (index*index) <= num; index++) {
			
			// if number is completely divisible with 
			// current index; that's a needed divisor
			if((num % index) == 0) {
				//System.out.print(index+" ");
				divSum+= index;
				
				// if division with current index doesn't result same 
				// as number & it's not repeated; that's a needed divisor
				indexDiv = (num/index); 
				if(indexDiv != num && indexDiv != index) {
					//System.out.print(indexDiv+" ");
					divSum+= indexDiv;
				}
			}
		}
		// if sum of divisors & current number is same
		return (divSum == tempNum);
	}
}
