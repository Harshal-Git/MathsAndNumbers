
Instead of checking for all the numbers; the solution to validate prime number can be improved.

##

Efficient Approach 1: 
In general, divisors will appear in pair. So suppose number 'n' has divisor pair (x, y); 
where x & y are not 1 and the number itself

then:

	If (x, y) is a pair => x * y = n
	
	so x^2 < n (in case when x <= y; we can say this)
	
	so x <= Sqrt(n)
	
	so out of whole pair, if we can find a lower divisor; then given number cannot be a prime number.   

##
	
Efficient Approach 2: If a number is too large, it's square root will also be huge. 

base cases:

1. all even numbers cannot be prime. so divisibility by 2 can be added.  
2. '2' itself is an even number & a prime number. needs to be handled separately.  
3. iteration can be saved if given number is completely divisible by '3'.
4. '3' it self is a prime number.
5. '1' itself is not a prime number.

further clarification is given in the book.
