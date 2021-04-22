How efficient method for finding trailing 0s will work?

-> Factorization in general : 

1, 2, 3, 4, 5, 6, 7, 8, 9, .... 25, 26, .... n

Now combination of 2 & 5 will cause the 0s in any factorial. So if we find such pairs, we can find the trailing 0s. 

Instead of finding pairs, we can pick 5 and we can find occurrence of it; which can give idea of 0s. 

So in above series of Factorial, to find such intervals based on 5, we can divide the series : n / 5

If any number goes beyond 20, there will be 25 also which has already factorization of 5. Hence we have to count such instances also. 
So we can include (n / 25) to find such instances.

Same way for higher numbers, 125 number also includes 5 in it's factorization. So (n / 125) also needs to be included.

So considering such factorizations, we can divide the series into factors of (n / 5) + (n / 25) + (n / 125) + ....

That's how the equation is made. 