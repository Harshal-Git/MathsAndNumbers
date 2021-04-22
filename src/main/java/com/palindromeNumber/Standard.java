/**
 * 
 */
package com.palindromeNumber;

/**
 * @author Harshal-Git
 *
 *	-> Standard approach
 *
 *	-> Time complexity:  0(log n - base 10) : length of the given number
 *	-> Space complexity: 0(1) 
 *	-> Auxiliary space: 0(1)
 */
public class Standard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 1221;
		System.out.println("Is "+number+" number palindrome? "+isPalindrome(number));
		
		number = 1236;
		System.out.println("Is "+number+" number palindrome? "+isPalindrome(number));
		
		number = 2;
		System.out.println("Is "+number+" number palindrome? "+isPalindrome(number));
		
		number = 13;
		System.out.println("Is "+number+" number palindrome? "+isPalindrome(number));
	}

	/**
	 * @param number
	 * @return
	 */
	private static boolean isPalindrome(int number) {
		int newNumber = 0;
		int tempNumber = number;
		
		/**
		 * while loop
		 */
		/*while(tempNumber > 0) {
			newNumber = (newNumber*10)+(tempNumber%10);
			tempNumber = tempNumber / 10;
		}*/
		
		/**
		 * for loop
		 */
		for(; tempNumber > 0; tempNumber = tempNumber / 10) {
			newNumber = (newNumber*10)+(tempNumber%10);
		}
		return (number == newNumber);
	}

}
