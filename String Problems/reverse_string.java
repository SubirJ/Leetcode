/*
Reverse of given string

This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”

Company : Google
*/

import java.io.*;
import java.util.*;

public class Test {	
	public static void main(String[] args){
		String s = "The Daily Byte", reverse = "";
		
		for(int i = (s.length() - 1); i >= 0; i--){
			reverse += s.charAt(i);
		}
		
		System.out.println(reverse);
    }
}