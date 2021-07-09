/** Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0

Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 120
Output: 21

Input: x = 0
Output: 0

Constraints:
-231 <= x <= 231 - 1

Company: 
Google question

**/
import java.io.*;
import java.util.*;

class Solution {
    public static int reverse(int x) {
        if(x == 0)
            return 0;
        
        long reverse = 0;
        boolean isNegative = x < 0 ? true : false;
        
        if((Math.pow(-2,31) <= x) && (x <= (Math.pow(2,31) - 1))){
            x = isNegative ? (x * -1) : x;
            while(x > 0){
                int y = x % 10;
                reverse = (reverse * 10) + y;
                if((Math.pow(-2,31) > reverse) || (reverse > (Math.pow(2,31) - 1)))
                    return 0;
                x = x / 10;
            }
        }
        else
            return 0;
        
        return (int)(isNegative ? reverse * -1 : reverse);
    }
	
	public static void main(String[] args){
		int x = 1534236469;

		System.out.println(reverse(x));
	}
}