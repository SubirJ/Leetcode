/*
zig-zag conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I 

Example 3:
Input: s = "A", numRows = 1
Output: "A"
*/

import java.util.*;

class ZigZag {
    public static String convert(String s, int numRows) {
        if(numRows == 1 || s.length() == 1)
            return s;
        
        HashMap<Integer, String> multiValueMap = new HashMap<Integer, String>();
        
        int cnt = 0;
        boolean small = true;
        for(int i=0; i<s.length(); i++){
            if(small){
                if(multiValueMap.get(cnt) == null)
                    multiValueMap.put(cnt, new String());
                String current = multiValueMap.get(cnt);
                multiValueMap.put(cnt, current + s.charAt(i));
                if(cnt == (numRows-1)){
                    small = false;
                    cnt--;
                }
                else
                    cnt++;
            }
            else{
                String current = multiValueMap.get(cnt);
                multiValueMap.put(cnt, current + s.charAt(i));
                if(cnt == 0){
                    small = true;
                    cnt++;
                }
                else
                    cnt--;
            }
        }
        
        String result = "";
        for(int key : multiValueMap.keySet()){
            result += multiValueMap.get(key);
        }
        
        return result;
    }
	
	public static void main(String[] args){
		String str = "PAYPALISHIRING";
		int rows = 3;
		
		System.out.println(convert(str, rows));
	}
}