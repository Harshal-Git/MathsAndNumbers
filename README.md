# MathsAndNumbers
programs related to Mathematics and numbers & bit operations : competitive preparation

##########

--> Find Time / Space / Auxiliary space for all logics and find optimum solution.

1. Find count of digits in a given number.	Ex: 123 --> 3. (com.numberOfDigits)
	-> Iterative approach
	-> Recursive approach
	-> Log solution approach
	
2. Given number is Palindrome OR not. (com.palindromeNumber)
	-> Standard approach
	
3. Factorial of a given number. (com.factorial)
	-> Iterative approach
	-> Recursive approach
	
4. Find trailing 0s in factorial of a given number. (com.trailingZerosOfAFactorial)

   -> Naive approach
   -> Efficient approach (more explained in readMe.txt)

	 ex: n = 5 ==> o/p = 1
		 n = 10 ==> o/p = 2	
		 n = 100 ==> o/p = 24

5. Find Fibonacci series up to given position. (com.fibonacci)

   -> Recursive approach
   -> Linear storage approach
   -> Without linear storage approach

6. GCD (Greatest common divisor) / HCF (Highest common factor): Largest number which divides both OR all given numbers	(com.GCD)

   -> Naive approach
   -> Euclidean algo 
   -> Optimized Euclidean algo (recursive version)

   Tiles puzzle is based on GCD	
	
	ex: a = 4, b = 6 ==> o/p = 2
		a = 100, b = 100 ==> o/p = 100	
		a = 7, b = 13 ==> o/p = 1

7. Find LCM (Least common multiple) : Smallest number which is divisible by all given numbers (com.LCM)
	-> Naive approach
	-> efficient solution : LCM(a, b) = (a * b) / GCD(a, b)
	
	ex: a = 4, b = 6 ==> o/p = 12
		a = 12, b = 15 ==> o/p = 60	
		a = 2, b = 8 ==> o/p = 8
		a = 3, b = 7 ==> o/p = 21
		
8. Prime number.	(com.prime)
   -> Naive approach
   -> Efficient solution 1: need to check only till Sqrt(n)
   -> Efficient solution 2:   
	
	ex: n = 13 ==> yes
		n = 14 ==> no
		n = 101 ==> yes
		
	first few prime numbers: 2, 3, 5, 7, 11, 13, 17, 19...
	
9. Prime factors of given number. Divisors of a number which are prime. (com.primeFactorsOfANumber)

   -> Naive approach: 
   -> Efficient solution: 

	ex: n = 12 ==> 2, 2, 3 ; n > 1
		n = 13 ==> 13 
		n = 315 ==> 3, 3, 5, 7
	
10. Print all divisors of a number. (com.factorsOfANumber)

    -> Naive approach : starting from 1 -> n, if any number completely divides given number, it's a divisor
    -> Efficient approach 1 : as divisors exist in pairs, we can run the loop till Sqrt(n) and find first half
    							and second half can be printed using first half 
    -> Efficient approach 2 : we can run first loop till Sqrt(n) and print first half
    						  then second half can be printed with different loop in reverse with second divisor 
    
	ex: n = 15 ==> o/p : 1 3 5 15
	    n = 100 ==> o/p : 1 2 4 5 10 20 25 50 100
	    n = 7 ==> o/p : 1 7
		
11. Sieve of Eratosthenes : find all prime numbers lesser or equal to the given number (com.findSmallerPrimeNumbers)

   -> Naive approach
   -> Efficient approach (could not understand usability of the algo - not completed)
   
	ex: n = 10 => o/p = 2 3 5 7  
	    n = 23 => o/p = 2 3 5 7 11 13 17 23

12. Computing power - calculate power of a number based on given inputs (com.computePower)
	
   -> Naive approach: 
   -> Efficient approach : recursive call
   -> iterative approach : (binary exponentiation - IterativePower)
   
	ex: x = 2 & n = 3 => o/p : 8
	    x = 3 & n = 4 => o/p : 81
	    x = 5 & n = 0 => o/p : 1
	    x = 5 & n = 1 => o/p : 5

13. Bit operations in Java :  

    -> AND / OR / XOR / NOT / left shift / right shift / unsigned right shift (com.bitwiseOperations)
    
    -> Check Kth bit is set OR not for given number; K >= 0 - position in binary representation of given number 		(com.bitwiseProblems) 

	ex: n = 5, k = 1 ==> o/p : Yes
		n = 8, k = 2 ==> o/p : No
		n = 0, k = 3 ==> o/p : No

   -> count number of set bits (com.countSetBits)
   
   	 1. Naive approach: keep dividing number by 2 and if we find any remainder, count such remainders. which will be expected count.
   	 2. Brian Kerningam's algorithm
   	 3. Look-up table method (could not understand much out of it)
   
	ex. n = 5 ==> o/p : 2  
		n = 7 ==> o/p : 3
		n = 13 ==> o/p : 3
		
   -> check whether given number is power of 2 OR not (com.powerOf2)
    
   1. Naive approach : repeatedly divide given number by 2 and if it has a remainder while dividing by 2, it's not power of 2
   2. Using Brian algo : 
   
	ex. n = 4 ==> o/p : Yes  
		n = 6 ==> o/p : No
		
  -> Find the odd times occurring number from given array (com.oddOccurringNumber)
  	1. naive approach: 
  	2. efficient approach 1 : XORing all numbers; at the end, ODD number only will remain.
  	3. variation question : find missing number from given array
  
	ex. [4, 3, 4, 4, 4, 5, 5] ==> o/p : 3
		[8, 7, 7, 8, 8] ==> o/p : 8

  -> Find the 2 odd times occurring numbers from given array (com.oddOccurringNumberDual)
   1. Naive approach 
   2. Efficient approach
   
  -> Generate power set of given set using bitwise operators (com.generatePowerSubsets)

	ex. s = "abc" ==> o/p = "", a, b, c, ab, ac, bc, abc 
		s = "ab" ==> o/p = "", a, b, ab
		
##########

Note down theories of efficient solutions of some important problems (primes / factors ...etc)

##

Digits in a factorial ? 
Given an integer N. Find the number of digits that appear in its factorial.  Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
Ex: Input: N = 5
Output: 3
Explanation: Factorial of 5 is 120.
Number of digits in 120 is 3 (1, 2, and 0)

##

Exactly 3 Divisors ?
Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
Ex: Input:
N = 6
Output: 1
Explanation: The only number with 3 divisor is 4. (Divisors of 4 : 1 2 4)

##

modulo sum

Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 
9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006

## 

Pascal triangle related examples