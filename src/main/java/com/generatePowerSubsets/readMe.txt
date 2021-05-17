-> For finding a power subset for any string: 

1. Find the possible combinations of subsets with the length of the string. If length is 'n'; then combinations will be (p = 2^n).
	(including the empty value).

2. Now all these number (starting from 0 -> p) can assumed as a binary sequence; in which will all set bits will represent a 
	power subset. 
	
		ex: String = abc
		
	=> combination = (2^3) = 8 = (0 -> 7)
	
			 2^2 | 2^1 | 2^0
			-----|-----|-----
	0	=>    0  |  0  |  0		=> '' (will be printed separately)
	1	=>	  0  |  0  |  1 	=> a 
	2	=>    0  |  1  |  0		=> b 
	3	=>    0  |  1  |  1  	=> ba
	4	=>	  1  |  0  |  0 	=> c
	5	=>    1  |  0  |  1 	=> ca
	6	=>    1  |  1  |  0		=> cb
	7	=>    1  |  1  |  1		=> cba
	
3. Now for each number from (0 -> p); start a nested iteration from (0 -> k; k < p) which will perform AND operation between the 
	number 'p' and left shift operation result of '1' with 'k'. Thus all the set bits will be checked. And For each set bit, 
	we can print kth character in the string.  