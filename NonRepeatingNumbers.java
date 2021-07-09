import java.io.*;
import java.util.*;

public class NonRepeatingNumbers {
	public static void main(String[] args){
		int[] arr = {1,2,3,3,2,4,5,5,4,7,9,9,11,12,13,12};
		ArrayList<Integer> arr_lst = new ArrayList<Integer>();
	
		for(int i=0; i<arr.length; i++){
			int cnt = 1;
			if(arr_lst.contains(arr[i]))
				continue;
			for (int j=0; j<arr.length;j++){
				if(arr[i] == arr[j]){
					cnt += 1;
					if(cnt > 2){
						break;
					}
				}
			}
			if(cnt > 2)
				arr_lst.add(arr[i]);
			else
				System.out.println(arr[i]);
		}
    }
}	