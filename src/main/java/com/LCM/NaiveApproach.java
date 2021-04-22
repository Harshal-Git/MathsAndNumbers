/**
 * 
 */
package com.LCM;

/**
 * @author Harshal-Git
 *
 * 	-> find LCM of 2 given numbers
 * 
 *	-> Naive approach: After finding highest number from given inputs, starting from that, keep on increasing numbers 
 *						until we find some number which is completely divisible by all given inputs. That's LCM for all inputs. 
 *
 *	-> Time complexity:  O((a*b) - max(a, b)) : iteration from max(a,b) to (a*b)
 *	-> Space complexity: 0(1)
 *	-> Auxiliary space:  0(1)
 */
public class NaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 4, b = 6;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));

		a = 12; b = 15;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));
		
		a = 2; b = 8;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));
		
		a = 3; b = 7;
		System.out.println("LCM("+a+", "+b+") = "+findLCM(a, b));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	private static int findLCM(int a, int b) {
		int maxNum = (a > b) ? a : b;
		while(true) {
			if(((maxNum % a) == 0) && ((maxNum % b) == 0)) {
				return maxNum;
			}
			maxNum++;
		}
	}

}
