# MathsAndNumbers
programs related to Maths and numbers : competitive preparation

-> Time complexity: 
-> Space complexity: 
-> Auxiliary space: 

##########

--> Find Time / Space / Auxiliary space for all logics and find optimum solution.

1. Find count of digits in a given number.	Ex: 123 --> 3. (com.numberOfDigits)
	-> Iterative approach
	-> Recursive approach
	-> Log solution approach
	
2. Given number is Palindrome OR not. (com.palindromeNumber)
	-> Standard approach
	
## PENDING FROM HERE ##

3. Factorial of a given number. ()
	-> Iterative approach
	-> Recursive approach
	
4. Find trailing 0s in factorial of a given number. (Mathematics fourth video - GFG)
	-> Multiple solutions

5. Find Fibonacci series up to given position. (com.fibonacci)

   -> Recursive approach
   -> Linear storage approach
   -> Without linear storage approach

6. GCD (Greatest common divisor : largest number which divides both OR all given numbers)/ HCF (Highest common factor) of given input.	
(Mathematics fourth video - GFG : related to Tiles puzzle)
	-> Naive approach
	-> Euclidean algo : if 'b' < 'a'  => gcd(a, b) = gcd(a-b, b)
	-> Optimized Euclidean algo
	
	ex: a = 4, b = 6 ==> o/p = 2
		a = 100, b = 100 ==> o/p = 100	
		a = 7, b = 13 ==> o/p = 1

7. Find LCM (Least common multiple: a number which is lowest and can be divisible by all given numbers) of given input.
	-> Naive approach
	-> efficient solution : LCM(a, b) = (a * b) / GCD(a, b)
	
	ex: a = 4, b = 6 ==> o/p = 12
		a = 12, b = 15 ==> o/p = 60	
		a = 2, b = 8 ==> o/p = 8
		a = 3, b = 7 ==> o/p = 21

8. Prime number.
   -> Naive approach
   -> Efficient solution 1 , 2  
	
	ex: n = 13 ==> yes
		n = 14 ==> no
		n = 101 ==> yes
		
	first few prime numbers: 2, 3, 5, 7, 11, 13, 17, 19...
	
9. Prime factors of given number. Divisors of a number which are prime.

	ex: n = 12 ==> 2, 2, 3 ; n > 1
		n = 13 ==> 13 
		n = 315 ==> 3, 3, 5, 7
		
10. Print all divisors of a number. 
		
##########

Pascal triangle
Convert given number into binary / hexadecimal etc.