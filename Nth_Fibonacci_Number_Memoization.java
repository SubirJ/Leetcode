import java.io.*;
import java.util.*;

class Fibo {
	static int[] dp = new int[10];
	
	static int fib(int n){
		
		if(n <= 1)
			return n;
			
		int first, second;
		
		if(dp[n-1] != -1)
			first = dp[n-1];
		else
			first = fib(n-1);
			
		if(dp[n-2] != -1)
			second = dp[n-2];
		else
			second = fib(n-2);
			
		//Memoization
		return dp[n] = first + second;
	}
	
	public static void main(String[] args){
		Arrays.fill(dp, -1);
			
		System.out.println("\nFinal Value :");
		System.out.println(fib(9));
		
		System.out.println("\nArray Values :");
		for(int i=0; i<dp.length; i++)
			System.out.println(dp[i]);
    }
}