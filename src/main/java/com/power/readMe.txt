Efficient approach: Explanation for EfficientApproach1.java

This recursive approach works on the point whether power is EVEN / ODD.

Suppose a^b = C; => a*a*a*...a [b times] = C
	
Here either of the following possibility is there:

	a. if 'b' is even then the series (a*a*a...) can be exactly divided in half.
	
		(a*a*a...)[b/2 times] * (a*a*a...) [b/2 times] 
		
		= 	R * R
		
		So result of half calculation 'R' can be multiplied with itself to find full result.
		
	a. if 'b' is ODD then the series (a*a*a...) can be exactly divided in 3 parts. 
		
		(a*a*a...)[b/2 times] * a * (a*a*a...) [b/2 times]
		
		= R * a * R
		
		So result of half calculation 'R' can be multiplied with itself & with one additional 'a' to find full result.
		
#######

