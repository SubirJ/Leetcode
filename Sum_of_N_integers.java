import java.io.*;
import java.util.*;

class Solution {	
	public static int nth_sum(int n){
		return (n * (n + 1))/2;
	}

	public static void main(String[] args){
		int n = 5, sum=0;
		
		//Fast and Simple Method with time complexity of O(1)
		System.out.println("Fast Method using direct formaula : (N*(N+1))/2");
		System.out.println(nth_sum(n));
		
		//Standard Method with time complexity of O(n)
		System.out.println("\nStandard method with one loop");
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		
		System.out.println(sum);
		
		//Worst Case Method with time complexity of O(n^2)
		System.out.println("\nWorst Method with 2 loops");
		sum = 0;
		for(int i=1; i<=n; i++){
			for(int j = 1; j <= i; j++){
				sum+=1;
			}
		}
		
		System.out.println(sum);
    }
}	