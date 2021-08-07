/*
Best Case of following algorithm : O(1), It does not give us much information to make our algorithm efficient.
Not used much.

Average Case : O((C1n + C2) + (C3)) where C1,C2 and C3 are constants that is average of all the cases possible, 
which is impractical most of the times.

Worst Case : O(n), Gives detailed idea of worst case scenario, Used very frequently

*/

import java.io.*;
import java.util.*;

class Sum_Even_Odd{
	public static int getSum(int n){
		if(n % 2 == 0) //If n is even then worst case and best case is O(1), as it directly returns 0
			return 0;
		int sum = 0;   
		for(int i = 1; i<=n; i++){ //In case of odd n, the loop will run n times giving time complexity as O(n)
			sum += i;
		}
		return sum;
	}
		
	public static void main(String[] args){
		int n = 5;
		
		System.out.println(getSum(n));
    }
}	