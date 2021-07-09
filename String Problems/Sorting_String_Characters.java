//Input: 'edbca'
//Output: 'abcde'

import java.io.*;
import java.util.*;

class Solution 
{ 
    static String sort(String s) 
    {
        int[] arr = new int[s.length()];
        String new_string = "";
        // code here
        for(int i=0; i<s.length(); i++){
            arr[i] = (int)s.charAt(i);
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++)
            new_string += (char)arr[i];
        
        return new_string;
    }
	
	public static void main(String[] args){
		String s = "edcba";

		System.out.println(sort(s));
		
		//Short method
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}
} 